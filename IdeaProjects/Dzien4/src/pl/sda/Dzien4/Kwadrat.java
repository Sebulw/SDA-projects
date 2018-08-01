package pl.sda.Dzien4;

public class Kwadrat{                   //Prostokąt dziedziczy z kwadratu ponieważ prostokąt ma więcej różnych cech, jeżeli byłoby odwrotnie to kwadrat niepotrzebnie dostawał by bok B
    double bokA;

    public Kwadrat(){                   //Konstruktor domyślny kwadratu dla przypadku gdy kwadrat nie posiada parametrów
        bokA=1;                         //Niezbędny do stworzenia innych konstruktorów w prostokącie
    }
    public Kwadrat(double a){
        bokA = a;
    }
    public double powierzchnia(){
        return bokA*bokA;
    }
}
