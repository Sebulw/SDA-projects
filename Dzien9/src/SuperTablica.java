public class SuperTablica {
    int[] tablica = new int[1000000];
    int wielkosc=0;

    public void wstaw(int element, int index)
    {
        for(int i=wielkosc+1 ; i>index ; --i)
        {
            tablica[i]=tablica[i-1];
        }
        tablica[index]=element;
        wielkosc++;
    }

    public int get(int index)
    {
        if(index>wielkosc-1)
            return Integer.MAX_VALUE;
        if (index<0)
            return Integer.MIN_VALUE;
        return tablica[index];
    }

    public int getSize()
    {
        return wielkosc;
    }

    public int szukaj(int wartosc)
    {
        for(int i=0; i<wielkosc; ++i)
            if(tablica[i] >= wartosc) return i;

        return -1;
    }

    /*public int szukajBinarnie(int wartosc)
    {
        int l= 0;
        int p = wielkosc;
        int s = (int) ((l+p)/2);
        while (l <= p)
        {
            if (tablica[s] == wartosc) {
                return s;
            }
            else if (tablica[s] < wartosc) {
                l = s+1;
            }
            else {
                p = s-1;
            }
            return -1;
        }


        return wartosc;
    }*/

    public int szukajBinarnie(int wartosc)
    {
        int idx = wielkosc/2;
        int skok = wielkosc/4;
        while(! (get(idx) >= wartosc && get(idx-1) < wartosc))
        {   //Decyzja czy skok do przodu czy do tyłu
            if(get(idx)>=wartosc)
                idx = idx - skok;
            else
                idx = idx + skok;
            //skok/2
            skok=(skok/2);
            if(skok==0)
                skok=1;
        }
        return idx;
    }


    public void wstawRosnaco(int wstawiana){
        int zna = szukajBinarnie(wstawiana);
        if(zna==-1)
            wstaw(wstawiana,wielkosc);
        else
            wstaw(wstawiana,zna);
    }
}