package pl.sda.Polimorfizm;

public class Trapez extends FiguraGeometryczna {
    int bokB;
    int wysokosc;

    public Trapez(int a, int b, int h) {
        bokA = a;
        bokB = b;
        wysokosc = h;
        this.nazwaKlasy = "Trapez";
    }

    protected double powierzchnia() {
        return ((bokA+bokB)*wysokosc)/2;
    }


}
