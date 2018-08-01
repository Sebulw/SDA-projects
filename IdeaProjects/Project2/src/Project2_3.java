import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Project2_3 {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        /*int tablica[] = new int[100];
        tablica[0] = 50;
        tablica[1] = 100;

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);

        int tablica1[] = {1,2,3,4,5,6,7};

        System.out.println(tablica1[6]); */

        /*int[] tablica = new int[10];
        for (int i = 0; i < 10; i++)
            tablica[i] = 10 -i;
        for (int i = 0; i < 10; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]); */

        int tablica[] = new int[10];
        Random generator = new Random();
        for (int i = 0; i < 10; i++)
            tablica[i] = generator.nextInt(100);
        for (int i = 0; i < 10; i++)
            System.out.println("Zawartość tablicy: "+tablica[i]+" o indexie: "+i);

        int opcje = -1;

        do {
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1- wyszukaj wartość w tablicach");
            System.out.println("2- odczytaj wartość z tablicy o wybranym indexie");

            int wyborOpcji = 0;
            try {
                wyborOpcji = Integer.parseInt(skaner.nextLine());
            }catch (NumberFormatException o) {
                System.out.println("Niepoprawne dane!");
            }

                boolean czyZnaleziono = false;

                switch (wyborOpcji) {
                    case 1:
                        System.out.println("Wybierz wartość");
                        int szukanaWartosc = skaner.nextInt();
                        for (int i = 0; i < 10; i++)
                            if (szukanaWartosc == tablica[i]) {
                                System.out.println("Wyszukana wartość znajduje się w tablicy o indexie: " + i);
                                czyZnaleziono = true;
                            }
                        if (!czyZnaleziono) {
                            System.out.println("Żadna z tablic nie zawiera podanej wartości");
                        }
                        break;
                    case 2:
                        System.out.println("Podaj index:");
                        int indexNr = skaner.nextInt();
                        System.out.println(tablica[indexNr]);
                        break;
                }
        } while (opcje == -1);

    }
}
