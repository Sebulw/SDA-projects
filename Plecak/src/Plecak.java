import java.util.ArrayList;

public class Plecak {

    ArrayList<Rzecz> rzeczy;

    Plecak(ArrayList<Rzecz> rzeczy)
    {
        this.rzeczy = rzeczy;
    }

    /*private ArrayList<Rzecz> wybierzElementy(int pojemnosc)
    {
        ArrayList<Rzecz> rzeczyWybrane = new ArrayList<Rzecz>();

        for (int i =0; i <= rzeczy.size(); i++)
        {
            if (rzeczy.get(0).waga <= pojemnosc)
            {
                rzeczyWybrane.add(rzeczy.get(0));
                pojemnosc -= rzeczy.get(i).waga;
            }
        }
        return rzeczyWybrane;
    }*/

    private ArrayList<Rzecz> wybierzElementy(int pojemnosc)
    {
        ArrayList<Rzecz> rzeczyWybrane = new ArrayList<Rzecz>();

        rzeczy.sort((r1, r2) -> (int) (100*(r2.getRatio() - r1.getRatio() )) );

        for (Rzecz r : rzeczy)
        {
            if (r.waga <= pojemnosc)
            {
                rzeczyWybrane.add(r);
                pojemnosc -= r.waga;
            }
        }

            if (rzeczy.get(0).waga <= pojemnosc)
            {
                rzeczyWybrane.add(rzeczy.get(0));
            }
        return rzeczyWybrane;
    }
    //Zwraca wynik ile udało się uzyskać maksymalnie wartości plecaka
    private int wybierzElementy(int pojemnosc, ArrayList<Rzecz> pozostaleRzeczy)
    {
        //WYNIK NAJLEPSZY
        int najlepszyWynik;

        for (/* pow wszystkich elementach pozostaleRzeczy */)
        {
            if (pojemnosc >= rzeczy.get(0).waga)                /*element się zmieści*/
            {

                //wywołaj samą siebie z parametrami o pomniejszonej pojemności i z pomniejszoną liczbą Rzeczy
                //Wartość wywołania zapisz do zmiennej WYNIK.
                // Sprawdź czy WYNIK  jest lepszy niż  NAJLEPSZY WYNIK, jeśli tak to podmień
            }
        }
        return najlepszyWynik;
    }



    public void wypiszWybraneElementy(int pojemnosc)
    {
        //ta metoda wypisuje rzeczy wybrane w metodzie wybierzElementy

        for (Rzecz r : wybierzElementy(pojemnosc))
            System.out.println("Element warty "+r.wartosc+"$ waży "+r.waga+"kg");
    }

    public int sumaWartosci(int pojemnosc)
    {
        //wywołuje metodę wybierzElementy, sumuje wartości i zwraca wynik

        int suma = 0;
        for (Rzecz r : wybierzElementy(pojemnosc))
            suma+=r.wartosc;
        return suma;
    }
}