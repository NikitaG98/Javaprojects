package p_menuBill;

import java.util.Scanner;

public class FoodMenu
{
    public static void main(String[] args) {
        System.out.println("1.Idli\n2.Dosa\n3.Wada\n4.Exit\nEnter choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        float plates,amt;
        do {
            switch (choice) {
                case 1:
                    System.out.println("Idli");
                    System.out.println("How many plates?");
                    plates = scanner.nextFloat();
                    amt = plates * 50;
                    System.out.println("Please Pay Rs " + amt);
                    break;
                case 2:
                    System.out.println("Dosa");
                    System.out.println("How many plates?");
                    plates = scanner.nextFloat();
                    amt = plates * 100;
                    System.out.println("Please Pay Rs " + amt);
                    break;
                case 3:
                    System.out.println("Wada");
                    System.out.println("How many plates?");
                    plates = scanner.nextFloat();
                    amt = plates * 30;
                    System.out.println("Please Pay Rs " + amt);
                    break;
                case 4:
                    System.out.println("Are you sure to exit 1 or 0?");
                default:
                    System.out.println("Invalid choice entered");
                    break;

            }
        }while (true);
    }
}
