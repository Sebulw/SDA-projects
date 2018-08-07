public class Main {

    public static void main(String[] args) {

        Drzewo drzewo1 = new Drzewo("Korzeń");
        drzewo1.korzen = new Wezel("Samochód");


        Wezel wezel1 = new Wezel("Wewnątrz");
        Wezel wezel2 = new Wezel("Zewnątrz");
        Wezel wezel3 = new Wezel("Silnik");

        drzewo1.dodajWezel(drzewo1.korzen, wezel1);
        drzewo1.dodajWezel(drzewo1.korzen, wezel2);
        drzewo1.dodajWezel(drzewo1.korzen, wezel3);

        Wezel wezel5 = new Wezel("Radio");
        Wezel wezel6 = new Wezel("Kierownica");

        drzewo1.dodajWezel(wezel1, wezel5);
        drzewo1.dodajWezel(wezel1, wezel6);

        Wezel wezel7 = new Wezel("Karoseria");
        Wezel wezel8 = new Wezel("Drzwi");
        Wezel wezel9 = new Wezel("Szyby");

        drzewo1.dodajWezel(wezel2, wezel7);
        drzewo1.dodajWezel(wezel2, wezel8);
        drzewo1.dodajWezel(wezel2, wezel9);

        Wezel wezel10 = new Wezel("Tłoki");
        Wezel wezel11 = new Wezel("Pierścienie");
        Wezel wezel12 = new Wezel("Popychacze");

        drzewo1.dodajWezel(wezel3, wezel10);
        drzewo1.dodajWezel(wezel3, wezel11);
        drzewo1.dodajWezel(wezel3, wezel12);




        drzewo1.wypiszDzieci(drzewo1.korzen, 1);

    }

}
