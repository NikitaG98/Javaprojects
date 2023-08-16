package p_edubridge;

public class GetSetEx
{
    class Person {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void displayPerson() {
            System.out.println("Data of the Person class: ");
            System.out.println("Name: " + this.name);
        }
    }
    public class StudentAccess extends Person {
        public void displayStudent() {
            System.out.println("Data of the Student class: ");
        }

        public static void main(String[] args) {
         //   StudentAccess std = new StudentAccess();

           // std.setName("Pooja");
            //System.out.println(std.getName());
            //std.displayPerson();
            //std.displayStudent();
        }
    }
}
