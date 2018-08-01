package pl.sda.Interfejsy;

public class Kwadrat implements FiguryGeometryczne{
    double a = 5.0;
    double b = 3.0;
    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double powierzchnia() {
        return a*b;
    }

    public void przedstawSie() {
        System.out.println("Jestem kwadratem");
    }
}
