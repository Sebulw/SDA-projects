package pl.sda.Polimorfizm;

public class Main {

    public static void main(String[] args) {

        Zwierze zwierzetaDomowe[] = new Zwierze[2];
        zwierzetaDomowe[0] = new Kot();
        zwierzetaDomowe[1] = new Pies();

        for(Zwierze z : zwierzetaDomowe)
            z.dajGlos();


        //ZADANIE NIŻEJ


        FiguraGeometryczna figury[] = new FiguraGeometryczna[4];
        figury[0] = new Rownoleglobok(5, 5);
        figury[1] = new Romb(5,5);
        figury[2] = new Deltoid(25, 2);
        figury[3] = new Trapez(5, 5, 2);

        for (FiguraGeometryczna p : figury)
            p.wypiszPowierzchnie();

    }
}
