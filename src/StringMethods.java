import java.util.Scanner;
 public class StringMethods {
     public static void main (String [] args) {
         Scanner reader = new Scanner(System.in);

         System.out.println("Enter a word: ");
         String word = reader.nextLine();

         System.out.println("Enter a number as an index: ");
         int index = Integer.parseInt(reader.nextLine());

         if (index > word.length()) {
             System.out.println("Index is larger than length. ");
         } else {
             System.out.println("The length of " + word + " is: " + word.length());
             System.out.println("The substring from 0 to " + index + " is: " + word.substring(0,index));
             }
         System.out.println("Do you want to continue (Yes/No? ");
         String answer = reader.nextLine();

         if (answer.equalsIgnoreCase("Yes")) {
             System.out.println("Enter a word: ");
             word = reader.nextLine();

         } else {
             System.out.println("Goodbye! ");
         }
     }
 }
