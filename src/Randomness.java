import java.util.Random;
public class Randomness {
    public static void main(String [] args) {


        Random r = new Random();

        int x = 5 + r.nextInt(10);

        System.out.println("My randoom number is: " + x);

        System.out.println("Here are a set of randoom numbers from 1-10. ");
        System.out.println(1+r.nextInt(10));
        System.out.println(1+r.nextInt(10));
        System.out.println(1+r.nextInt(10));
        System.out.println(1+r.nextInt(10));
        System.out.println(1+r.nextInt(10));

        System.out.println("Here are some numbers from 1-100");
        System.out.println(1+r.nextInt(100));
        System.out.println(1+r.nextInt(100));
        System.out.println(1+r.nextInt(100));
        System.out.println(1+r.nextInt(100));
        System.out.println(1+r.nextInt(100));

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }
    }
}
