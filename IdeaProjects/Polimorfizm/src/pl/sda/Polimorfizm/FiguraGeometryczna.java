package pl.sda.Polimorfizm;

public abstract class FiguraGeometryczna {          // public abstract class pozwala na użycie metody bez ciała
    String nazwaKlasy;
    int bokA;

    public FiguraGeometryczna() {
        bokA = 1;
    }
    public FiguraGeometryczna(int a) {
        bokA = a;
    }

    protected abstract double powierzchnia();       //metoda bez żadnego ciała zostaje przekazana do dzieci które ją nadpisują

    public void wypiszPowierzchnie() {
        System.out.println(nazwaKlasy+" ma powierzchnie równą: "+powierzchnia());
    }
}
