import java.util.Scanner;

public class Project2_2 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj wysokość trójkąta:");
        int wysokosc = skaner.nextInt();

        for (int i=1 ; i<=wysokosc ; i++) {
            for (int j=0 ; j<i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
