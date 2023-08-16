package p_edubridgeJdbc;
import java.sql.*;
import java.util.Scanner;
public class MenuDrivenExmple
{
        private static final String DB_URL = "jdbc:mysql://localhost:3306/emp1?useTimezone=true&server=UTC";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "admin@1234";

        public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("Menu:");
                    System.out.println("1. Add Person");
                    System.out.println("2. View Persons");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            addPerson(connection, scanner);
                            break;
                        case 2:
                            viewPersons(connection);
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                    }
                } while (choice != 3);

                connection.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        private static void addPerson(Connection connection, Scanner scanner) throws SQLException {
            System.out.print("Enter person's ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter person's name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            String insertQuery = "INSERT INTO person(id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();

            System.out.println("Person added successfully.");
        }

        private static void viewPersons(Connection connection) throws SQLException {
            String selectQuery = "SELECT id, name FROM person";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            System.out.println("Person:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            resultSet.close();
            statement.close();
        }
    }


