import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int days = Integer.parseInt(reader.nextLine());


      String monthName;
        switch (days) {
            case 31:
                monthName  = "January, March, May, July, August, October, December.";
                break;
            case 30:
                monthName = "September, April, June, November.";
                break;
            case 29:
              monthName = "February";

                break;
            case 28:
                monthName = "February";
                break;
            default:
                monthName = "Impossible! ";
                break;
        }
        System.out.println(monthName);
    }
}
