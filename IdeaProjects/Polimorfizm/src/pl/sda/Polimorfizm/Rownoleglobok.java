package pl.sda.Polimorfizm;

public class Rownoleglobok extends FiguraGeometryczna {
    int wysokosc;

    public Rownoleglobok() {
    }

    public Rownoleglobok(int a, int h) {
        bokA = a;
        wysokosc = h;
        this.nazwaKlasy = "Równoległobok";
    }
    protected double powierzchnia() {
        return bokA*wysokosc;
    }
}
