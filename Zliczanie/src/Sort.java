public class Sort {

    public static int[] sort(int[] tablica)
    {
        int[] tablicaPomocnicza = new int[101];

        int[] wyniki = new int[tablica.length];

        //Pętla po tablicy która pod indeksy tablicy pomocniczej wpisze ilość wystąpień danej liczby

        for (int i = 0; i < tablica.length; i++)
        {
            tablicaPomocnicza[tablica[i]]++;
        }
        //Pętla, która do tablicy wyniki wpisze element tyle razy ile jest zapisane w tablicy pomocniczej
        int pomocniczaLicznik = 0;
        int wynikiLicznik =0;
            while (pomocniczaLicznik < tablicaPomocnicza.length)
            {

                if (tablicaPomocnicza[pomocniczaLicznik] != 0) {
                    wyniki[wynikiLicznik++] = pomocniczaLicznik;
                    tablicaPomocnicza[pomocniczaLicznik]--;
                }
                else
                    pomocniczaLicznik++;
            }
        return wyniki;
    }

}
