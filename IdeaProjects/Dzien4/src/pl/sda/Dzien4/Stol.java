package pl.sda.Dzien4;

public class Stol extends Mebel {
    int iloscNog;

    public Stol(int a, int b, int c, int d) {
        dlugosc = a;
        szerokosc = b;
        wysokosc = c;
        iloscNog = d;
    }

    public void wymiary() {
        System.out.println("Wymiary tego stołu to: "+dlugosc+"cm, "+szerokosc+"cm, "+wysokosc+"cm. Osadzony jest na "+iloscNog+" nogach.");
    }

}
