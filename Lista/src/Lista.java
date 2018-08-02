public class Lista {

    ElementListy start;

    // zwraca element równy lub pierwszy mniejszy

    ElementListy szukaj(int wartosc)
    {
        ElementListy aktualny = start;

        while (aktualny.nastepny != null && aktualny.nastepny.wartosc < wartosc)
        {
            aktualny = aktualny.nastepny;
        }
        return aktualny;

    }

    //
    /*private void stworziWstawPomiedzy(int wartosc, ElementListy poprzednik, ElementListy naspepnik)
    {
        start = new ElementListy(wartosc, null);
    }*/

    // Wstawia element o podanej wartości miedzy element mniejszy i większy od niego

    void wstaw(int wartosc)
    {

        //Tworzy nowy element listy i wstawia w odpowiednie miejsce
        if (start == null)
        {
            start = new ElementListy(wartosc, null);
        }
        else if (start.wartosc >= wartosc)
        {
            ElementListy nowy = new ElementListy(wartosc, start);
            start = nowy;
        }
        else
        {
            ElementListy poprzednik = szukaj(wartosc);
            ElementListy nowy = new ElementListy(wartosc, poprzednik.nastepny);
            poprzednik.nastepny = nowy;
        }

    }
    // Wypisuje całą liste od start do końca
    void  wypiszListe()
    {
        ElementListy aktualny = start;
        do {
            System.out.println(aktualny.wartosc);
        }while ((aktualny = aktualny.nastepny) != null);

    }

}
