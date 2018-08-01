package pl.sda.fabryka;

import java.util.Random;

public class Fabryka {

    public static final Telewizor[] stworzTelewizor(int ilosc) {

        Telewizor[] telewizory = new Telewizor[10];
        for (int i = 0; i < 10 ; i++) {
            Random generator = new Random();
            int p = generator.nextInt();
            int c = generator.nextInt();
            int r = generator.nextInt();
            boolean s = generator.nextBoolean();
            telewizory[i] = new Telewizor(p, c, r, s);
        }

        return telewizory;

    }

    public static void printTv(Telewizor[] tv) {
        for (int i = 0; i < tv.length ; i++) {
            System.out.println(i);
        }
    }

}
