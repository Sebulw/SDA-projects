import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz swój tekst");
        String text = scan.next();

        String regex = "(\\d)";

        System.out.println(text.replaceAll(regex, ""));                       // tekst wyświetlany po edycji

        String text2 = scan.next();
        String regex2 = "(\\s|^)a";
        System.out.println(text2.replaceAll(regex2, "@"));
    }

}
