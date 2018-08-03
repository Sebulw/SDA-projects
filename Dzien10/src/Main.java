import java.util.Random;

public class Main {

    public static void main(String[] args){

        //System.out.println(Silnia.silnia(5));

        //System.out.println(Newton.newton(2,5));

        Random losuj = new Random();

        long startTime = System.nanoTime();

        for (int i=0; i<30;i++)
        {
            System.out.println(""+i+": "+Newton.newton(30, i));
        }

        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime) /1000000.0;
        System.out.println(elapsedTime);
    }

}
