package p_seasonSwitch;

import java.util.Scanner;

public class SseasonSwitch
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Month no.:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("----Month is Winter----");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("----Month is Spring----");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("----Month is Summer----");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("----Month is Autumn----");
                break;
            default:
                System.out.println("Invalid Month no. Entered");
                break;

        }
    }
}
