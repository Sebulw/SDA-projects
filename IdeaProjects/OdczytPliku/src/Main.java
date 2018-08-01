import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File list = new File("lista.txt");
        Scanner wejscie = new Scanner(list);
        Scanner skaner = new Scanner(System.in);


        System.out.println("Oto Twoja lista osób:");
        Set<String> names = new TreeSet<>();

        boolean exit = true;
        while(exit) {

            System.out.println("Twoja lista posiada "+names.size()+" osób");
            System.out.println("Aby dodać osobę do listy wciśnij 1");
            System.out.println("Aby usunąć osobę z listy wciśnij 2");
            System.out.println("Aby wyświetlić osoby z listy");
            System.out.println("Aby zakończyć działanie programu wciśniej 4");
            System.out.println("Aby pobrać liste z pliku wciśnij 5");

            int userChoice = skaner.nextInt();
            String name = skaner.nextLine();

            switch (userChoice) {
                case 1:
                    System.out.println("Dodaj osobę:");
                    if (names.contains(name)) {
                        System.err.println("Podana osoba jest już na liście!");
                    }
                    names.add(name);
                    System.out.println("Osoba została dodana do listy.");

                    break;
                case 2:
                    System.out.println("Podaj imię i nazwisko osoby, którą chcesz usunąć z listy");
                    names.remove(skaner.nextLine());
                    System.out.println("Podana osoba została usunięta z listy");
                    break;
                case 3:
                    int i = -1;
                    for (String str : names)                 //SPRAWDZIĆ DZIAŁANIE LISTY W DEBUGERZE
                        System.out.println(str);
                    break;
                case 4:
                    exit = false;
                    break;
                case 5:
                    System.out.println("Wpisz nazwę pliku:");
                    String line;

                    while (wejscie.hasNextLine()) {
                        line = wejscie.nextLine();
                        System.out.println(line);
                    }
                default:
                    System.err.println("Brak opcji w menu");
                    System.out.println();
                    break;
            }
        }

    }

}


// DOKOŃCZYĆ