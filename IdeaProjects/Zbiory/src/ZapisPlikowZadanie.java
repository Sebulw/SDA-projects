import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisPlikowZadanie {

    public static void main(String[] args) throws IOException {

        Scanner skaner = new Scanner(System.in);
        PrintWriter printer = new PrintWriter(new FileWriter("wyniki.txt", true));

        boolean exit = true;
        while (exit) {

            System.out.println("Aby dodać nowe wyniki wybierz 1");
            System.out.println("Aby zapisać wyniki do pliku wciśnij 2");
            int userChoice = Integer.parseInt(skaner.nextLine());

            switch (userChoice) {
                case 1:
                    System.out.println("Podaj nazwę pierwszej drużyny:");
                    String name1 = skaner.nextLine();
                    System.out.println("Podaj liczbę bramek pierwszej drużyny:");
                    int score1 = Integer.parseInt(skaner.nextLine());               // PARSUJE INTA DO STRINGA, bez tego będzie uciekała linia/enter
                    System.out.println("Podaj nazwę drugiej drużyny:");
                    String name2 = skaner.nextLine();
                    System.out.println("Podaj liczbę bramek drugiej drużyny:");
                    int score2 = Integer.parseInt(skaner.nextLine());
                    if (score1 == score2) {
                        System.out.println("Wygląda na to, że mecz został zakończony karnymi.");
                        System.out.println("Podaj wynik karnych pierwszej drużyny:");
                        int score3 = Integer.parseInt(skaner.nextLine());
                        System.out.println("Podaj wynik karnych drugiej drużyny:");
                        int score4 = Integer.parseInt(skaner.nextLine());
                        printer.println(name1 + " <" + score1 + ">("+score3+") : ("+score4+")<" + score2 + "> " + name2);
                    }else {
                        printer.println(name1 + " <" + score1 + "> : <" + score2 + "> " + name2);
                    }
                    break;
                case 2:
                    printer.close();
                    exit = false;
                    break;
            }
        }
    }


}


