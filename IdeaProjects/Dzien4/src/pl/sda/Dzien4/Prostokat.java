package pl.sda.Dzien4;

public class Prostokat extends Kwadrat{
    double bokB;

    public Prostokat(double a, double b){
        bokA=a;
        bokB=b;
    }

   /* public  Prostokat(double a) {     // Można w taki sposób użyć prostokąta aby przyjmował za parametr tylko bok A
        bokA=a;
        bokB=a;
    }*/

    public double powierzchnia(){
        return bokA*bokB;
    }
}