public class Rzecz {

    public int waga;            //0-100
    public int wartosc;         //0-100

    Rzecz(int waga, int wartosc)
    {
        this.waga = waga;
        this.wartosc = wartosc;
    }

    public double getRatio()
    {
        return (double) wartosc / (double)waga;
    }

}
