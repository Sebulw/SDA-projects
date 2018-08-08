public class Kopiec {
    private int[] tablica;
    private int wielkosc=0;

    Kopiec(int maxWielkosc){
        tablica = new int[maxWielkosc];
    }

    public void zamienMiejscami(int element1, int element2)
    {
        int zamiana = tablica[element1];
        tablica[element1] = tablica[element2];
        tablica[element2] = zamiana;
    }

    public int pobierzIndeksRodzica(int indeksDziecka) //Zwraca indeks rodzica
    {
        if(indeksDziecka!=0)
            return (indeksDziecka -1) /2;
        return 0;
    }

    /*public int pobierzIndeksLewegoSyna(int numerOjca)
    {
        return (2*numerOjca)+1;
    }

    public int pobierzIndeksPrawegoSyna(int numerOjca)
    {
        return (2*numerOjca)+2;
    }

    public int zdejmijWierzcholek()
    {
        int wartoscWierzcholka = tablica[0];
        int indeksLewegoSyna = pobierzIndeksLewegoSyna(0);
        int indeksPrawegoSyna = pobierzIndeksPrawegoSyna(0);

        while (wartoscWierzcholka < indeksLewegoSyna || wartoscWierzcholka < indeksPrawegoSyna )
        {
            if (indeksLewegoSyna >= indeksPrawegoSyna)
            {
                zamienMiejscami(wartoscWierzcholka, indeksLewegoSyna);
            }

            else if (indeksPrawegoSyna > indeksLewegoSyna) {
                zamienMiejscami(wartoscWierzcholka, indeksPrawegoSyna);
            }
        }

        return wartoscWierzcholka;
    }*/


    public void napraw(int indeks)
    {
        int wartoscElementu = tablica[indeks];

        int wartoscLewego = 0;
        int indexLewego = 2*indeks +1;
        int wartoscPrawego = 0;
        int indexPrawego = 2*indeks +2;

        //Nie mamy zadnego syna:
        if(indexLewego >= wielkosc && indexPrawego >= wielkosc)
            return;

        if(indexLewego < wielkosc)
            wartoscLewego = tablica[indexLewego];

        if(indexPrawego < wielkosc)
            wartoscPrawego = tablica[indexPrawego];


        if(wartoscLewego>=wartoscPrawego && wartoscLewego > wartoscElementu)
        {
            //zamieniamy z lewym
            zamienMiejscami(indexLewego, indeks);
            napraw(indexLewego);
        }
        else if(wartoscPrawego>=wartoscLewego && wartoscPrawego > wartoscElementu)
        {
            //zamieniamy z prawym
            zamienMiejscami(indexPrawego, indeks);
            napraw(indexPrawego);
        }
    }

    public int zdejmijWierzcholek()
    {
        int wartoscWierzcholka=tablica[0];

        tablica[0] = tablica[--wielkosc];

        tablica[wielkosc]=wartoscWierzcholka;

        napraw(0);

        return wartoscWierzcholka;
    }

    public int wstaw(int wartosc) //wstawia i zwraca numer na który element został wstawiony
    {
        int miejsceWstawienia = wielkosc;
        tablica[wielkosc++] = wartosc;//wstawia element na koniec kopca

        int indeksRodzica = pobierzIndeksRodzica(miejsceWstawienia);
        //dopłuki wartość rodzica jest większa niż wartość wstawiana
        while ( tablica[indeksRodzica]  < wartosc ){

            zamienMiejscami(indeksRodzica, miejsceWstawienia);
            miejsceWstawienia = indeksRodzica;
            indeksRodzica = pobierzIndeksRodzica(miejsceWstawienia);
        }

        return miejsceWstawienia;
    }

    public int sortowanie()
    {
        int w = wielkosc;

        while (wielkosc>0)
            zdejmijWierzcholek();

        return w;
    }

    public void drukujTablice()
    {

    }

    public int pobierzElement(int index) //Zwraca wartosc elementu
    {
        return tablica[index];
    }

    public void wypisz()
    {
        System.out.println("------------------------------");
        int elementowNaPoziomie = 1;
        int odwiedzoneElementy = 0;
        //Math.log2(wielkosc);
        int liczbaPoziomow = (int)( Math.log10(wielkosc) / Math.log10(2.) );

        System.out.println("liczba poziomów: "+ liczbaPoziomow);

        int leftPadding = 5*(int)Math.pow(2,liczbaPoziomow-2);
        int middlePadding = leftPadding*2;

        while(odwiedzoneElementy<wielkosc)
        {

            //Padding
            for(int j=0; j<=leftPadding; ++j)
                System.out.print(" ");

            for(int j=0; j<elementowNaPoziomie; ++j)
            {
                if(tablica[odwiedzoneElementy]<10)
                    System.out.print(" ");
                System.out.print(tablica[odwiedzoneElementy++]+" ");
                for(int i=0; i<middlePadding; ++i )
                    System.out.print(" ");
            }
            System.out.println();
            elementowNaPoziomie*=2;
            leftPadding= leftPadding/2 -1;
            middlePadding= middlePadding/2 -1;

        }
    }


}