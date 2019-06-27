import java.util.Scanner;
public class ComparingStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How is the weather? ");
        String weather = reader.nextLine();

        if (weather.equalsIgnoreCase("rain")) {
            System.out.println("Take your umbrella! ");
        } else if (weather.equalsIgnoreCase("windy")) {
            System.out.println("Wear your jacket! ");
        } else if (weather.equalsIgnoreCase("snow")) {
            System.out.println("Wear a coat and take a shovel! ");
        } else if (weather.equalsIgnoreCase("stormy")) {
            System.out.println("You should stay inside! ");
        } else {
            System.out.println("Enjoy your day! ");
        }

        System.out.println("Do you want to continue? (y/n) ");
        String answer = reader.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("How is the weather? ");
            weather = reader.nextLine();
        } else {
            System.out.println("Goodbye! ");

    }

    }
}
