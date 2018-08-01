

import java.util.Scanner;

public class Brudnopis{


    public static void main(String[] args) {
        System.out.println("Jak masz na imię?");
        Scanner skaner = new Scanner(System.in);
        String name = skaner.next();
        if (name.endsWith("a")) {
            System.out.println("Podane imię jest prawdopodobnie żeńskie.");
        }
        else {
            System.out.println("Podane imię jest prawdopodobnie męskie.");
        }
        char firstLetter = name.charAt(0);
        String upperCaseName = name.toUpperCase();
        char firstLetterOfNameUpperCase = upperCaseName.charAt(0);
        System.out.println("Twoję imię ma "+name.length()+" liter.");

        if (firstLetter == firstLetterOfNameUpperCase) {
            System.out.println("Twoje imię zaczyna się z wielkiej litery.");
        }
        else {
            System.out.println("Nie wiesz, że imiona pisze się z wielkiej litery gamoniu?");
        }


    }
}