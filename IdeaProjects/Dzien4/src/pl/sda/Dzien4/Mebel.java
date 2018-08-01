package pl.sda.Dzien4;

public class Mebel {
    int dlugosc;
    int szerokosc;
    int wysokosc;

    public Mebel() {
        dlugosc = 10;
        szerokosc = 5;
        wysokosc = 5;
    }
    public Mebel(int a, int b, int c) {
        dlugosc = a;
        szerokosc = b;
        wysokosc = c;
    }
    public void wymiary() {
        System.out.println("Wymiary tego mebla to: "+dlugosc+"cm, "+szerokosc+"cm, "+wysokosc+"cm.");
    }

    /*public int wymiary2() {   // Return zwraca tylko jedną wartość ale można go użyć i potem w Main użyć souta z wywołaniem
        return dlugosc;
    }*/

}
