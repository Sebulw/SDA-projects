import java.util.Scanner;

public class HelloWorld {

        public static int pomnoz(int a, int b) {
            int wynik = a * b;
            return wynik;
        }
        public static void main (String[] args) {
            int wynik = pomnoz(5,5);
            System.out.println(wynik);
        }

}