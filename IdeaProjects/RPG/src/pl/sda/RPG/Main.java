package pl.sda.RPG;

        import java.util.Scanner;

public class Main {

    public static void Main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Bitwa lamusów!");
        System.out.println();
        System.out.println("Nazwij swoją postać i wybierz statystyki.");

        String userName = skaner.nextLine();

        Postac name = new Postac("Zagłoba", 6, 4, 2, 8);

        System.out.println("Twoja postać nazywa się "+this.name);

    }
}
