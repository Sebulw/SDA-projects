import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Lista mojaLista = new Lista();
        Random losuj = new Random();

        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            int wylosowanaLiczba = losuj.nextInt(100000);
            mojaLista.wstaw(wylosowanaLiczba);
        }

        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime) /1000000.0;
        System.out.println(elapsedTime);



        /*mojaLista.wstaw(15);
        mojaLista.wstaw(5);
        mojaLista.wstaw(2);
        mojaLista.wstaw(8);*/

        ElementListy element = mojaLista.szukaj(8);

//        mojaLista.wypiszListe();

    }

}
