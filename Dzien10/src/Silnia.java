public class Silnia {

    public static int silnia(int liczba)
    {
        // ma zwracać silnię z podanej liczby
        if (liczba <= 1)
        {
            return 1;
        }
        else
            return liczba*silnia(liczba-1);
    }

}
