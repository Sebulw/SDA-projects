package pl.sda;

import java.util.ArrayList;

public class Plecak {
    ArrayList<Rzecz> rzeczy; //lista rzeczy które potencjalnie można wkładać do środka

    public Plecak(ArrayList<Rzecz> rzeczy)
    {
        this.rzeczy = rzeczy;
    }

    private ArrayList<Rzecz> wybierzElementy(int pojemnosc)
    {
        ArrayList<Rzecz> rzeczyWybrane = new ArrayList<Rzecz>();

        rzeczy.sort((r1, r2) -> (int)(100*( r2.getRatio() - r1.getRatio())) );

        for (Rzecz r : rzeczy)
        {
            if(r.waga <= pojemnosc) {
                rzeczyWybrane.add(r);
                pojemnosc-=r.waga;
            }
        }

        return rzeczyWybrane;
    }

    public int wybierzBruteForce(int pojemnosc)
    {
        return sumaWartosci(pojemnosc);
        //return wybierzElementy(pojemnosc, rzeczy);
    }

    //Zwraca wynik ile udalo sie uzyskac maksymalnie wartosci plecaka
    private int wybierzElementy(int pojemnosc, ArrayList<Rzecz> pozostaleRzeczy)
    {
        int najlepszy=0;

        while(pozostaleRzeczy.size()>0) {
            Rzecz r = pozostaleRzeczy.get(0);
            pozostaleRzeczy.remove(r);
            if( r.waga <= pojemnosc) {
                ArrayList<Rzecz> listaBezWybranegoElementu = new ArrayList<>(pozostaleRzeczy);
                int wynik = r.wartosc + wybierzElementy(pojemnosc - r.waga, listaBezWybranegoElementu);
                if (wynik > najlepszy) najlepszy = wynik;
            }
        }
        return najlepszy;
    }


    public void wypiszWybraneElementy(int pojemnosc)
    {
        //ta metoda wypisuje rzeczy wybrane w metodzie wybierzElementy
        for(Rzecz r : wybierzElementy(pojemnosc) )
            System.out.println("element warty "+r.wartosc+"$ wazy "+r.waga+"kg");
    }

    public int sumaWartosci(int pojemnosc)
    {
        //wywoluje metode wybierzElementy, sumuje wartosci i zwraca wynik
        int suma=0;
        for(Rzecz r : wybierzElementy(pojemnosc) )
            suma+=r.wartosc;

        return suma;
    }




}