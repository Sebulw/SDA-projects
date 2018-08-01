package pl.sda.Polimorfizm;

public class Deltoid extends FiguraGeometryczna {
    int przekatna1;
    int przekatna2;

    public Deltoid(int a, int d2) {
        przekatna1 = a;
        przekatna2 = d2;
        this.nazwaKlasy = "Deltoid";
    }

    protected double powierzchnia() {
        return przekatna1/(2*przekatna2);
    }


}
