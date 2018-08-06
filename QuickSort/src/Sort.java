
public class Sort {
    static int[] tablicaQuickSort;

    public static int[] quickSortStart(int[] tablica) {
        tablicaQuickSort = new int[tablica.length];
        System.arraycopy(tablica, 0, tablicaQuickSort, 0, tablica.length);
        quickSort(0, tablicaQuickSort.length-1);
        return tablicaQuickSort;
    }

    public static void quickSort(int poczatek, int koniec) {
        int wskaznikPrawo = koniec;
        int wskaznikLewo = poczatek;
        int srodek = (wskaznikPrawo-wskaznikLewo)/2;

        while (wskaznikLewo <= wskaznikPrawo)
        {
            while(tablicaQuickSort[wskaznikLewo] < srodek)
            {
                wskaznikLewo++;
            }
            while (tablicaQuickSort[wskaznikPrawo] > srodek)
            {
                wskaznikPrawo--;
            }
            if (wskaznikLewo <= wskaznikPrawo)
            {
                zamiana(wskaznikLewo, wskaznikPrawo);
                wskaznikLewo++;
                wskaznikPrawo--;
            }
        }
        if (poczatek < wskaznikPrawo)
            quickSort(poczatek, wskaznikPrawo);
        if (wskaznikLewo < koniec)
            quickSort(wskaznikLewo, koniec);


        //Ta funkcja ma manipulować na tablicaQuickSort
    }

    public static void zamiana(int wskaznikLewo, int wskaznikPrawo) {
        int tymczasowa = tablicaQuickSort[wskaznikLewo];
        tablicaQuickSort[wskaznikLewo] = tablicaQuickSort[wskaznikPrawo];
        tablicaQuickSort[wskaznikPrawo] = tymczasowa;
    }
}