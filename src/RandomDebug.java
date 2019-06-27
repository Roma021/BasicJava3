
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class RandomDebug{
    public static void main(String[] args) {
        Random r = new Random();


      //  System.out.println("Generate 10 random integers from 1 to 6.");
      /*  System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6));
        System.out.println(1+r.nextInt(6)); */

        for (int i = 1; i <= 6; ++i)
        {
           int randomNum = 1 + r.nextInt(6);
            System.out.println("Generated numbers: " + randomNum);
        }

       // System.out.println("Done.");


    }
}