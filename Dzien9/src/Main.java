import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SuperTablica mojaTablica = new SuperTablica();

        Random losuj = new Random();

        long startTime = System.nanoTime();

        for(int i=0; i<100; ++i) {
            int wylosowanaLiczba = losuj.nextInt(100);
            mojaTablica.wstawRosnaco(wylosowanaLiczba);
        }

        for(int i=0; i<mojaTablica.getSize(); ++i)
        {
           System.out.println(""+i+" : "+mojaTablica.get(i));
        }


        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime)/1000000.0;
        System.out.println(elapsedTime);





        /*mojaTablica.wstaw(1,0);
        mojaTablica.wstaw(12,0);
        mojaTablica.wstaw(23,0);
        mojaTablica.wstaw(34,0);
        mojaTablica.wstaw(45,0);
        mojaTablica.wstaw(56,0);
        mojaTablica.wstaw(67,0);
        mojaTablica.wstaw(71,0);
        mojaTablica.wstaw(79,0);
        mojaTablica.wstaw(82,0);
        mojaTablica.wstaw(88,0);
        mojaTablica.wstaw(99,0);*/

        /*for(int i=0; i<mojaTablica.getSize(); ++i)
        {
            System.out.println(""+i+" : "+mojaTablica.get(i));
        }*/

    }
}