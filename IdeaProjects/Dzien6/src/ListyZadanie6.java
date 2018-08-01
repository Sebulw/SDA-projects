import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ListyZadanie6 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Lista");
        Scanner skaner = new Scanner(System.in);

        System.out.println("Oto Twoja lista zadań:");

        List<String> toDoList = new LinkedList<>();
        //List<String> trashList = new LinkedList<>();              //Do zaimplementowania później

        boolean exit = true;
        while(exit) {

            System.out.println("Twoja lista posiada "+toDoList.size()+" elementów");
            System.out.println("Aby dodać element do listy wciśnij 1");
            System.out.println("Aby usunąć element z listy wciśnij 2");
            System.out.println("Aby wyświetlić elementy listy i ich indexy wciśnij 3");
            System.out.println("Aby zakończyć działanie programu wciśniej 4");

            int userChoice = 0;
            try {
                userChoice = Integer.parseInt(skaner.nextLine());
            }catch (NumberFormatException o) {
                System.err.println("Niepoprawne dane!");
                System.out.println();
            }
            switch (userChoice) {
                case 1:
                    System.out.println("Dodaj element:");
                    toDoList.add(skaner.next());
                    System.out.println("Element został dodany do listy.");
                    break;
                case 2:
                    System.out.println("Podaj index elementu, który chcesz usunąć");
                    toDoList.remove(skaner.nextInt());
                    System.out.println("Element z Twojej listy został wyrzucony do śmietnika");
                    break;
                case 3:
                    int i = -1;
                    for (String str : toDoList)                 //SPRAWDZIĆ DZIAŁANIE LISTY W DEBUGERZE
                        System.out.println(++i+": "+str);
                        i++;
                        break;
                case 4:
                    exit = false;
                    logger.info("Koniec programu");
                    break;
                default:
                    System.err.println("Brak opcji w menu");
                    System.out.println();
                    break;
            }
        }

    }

}
