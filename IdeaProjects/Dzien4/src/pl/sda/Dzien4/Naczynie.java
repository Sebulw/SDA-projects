package pl.sda.Dzien4;

public class Naczynie {
    double glebokosc;

    public Naczynie() {
        glebokosc = 500.50;
    }

    public Naczynie(double a) {
        glebokosc = a;
    }

    public double pojemnosc() {
        return glebokosc*2;
    }

}
