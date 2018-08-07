public class FIFO {

    int[] tablica = new int[3];
    int poczatek = 0;
    int koniec = 0;

    public void enqueue(int value)
    {
        tablica[ (koniec++) % tablica.length ] = value;
                            // modulo tablica.length robi z tego circular

        // dodanie elementu do kolejki
    }

    public int dequeue()
    {

        // odkolejkowanie elementu z początku kolejki

        return tablica[(poczatek++) % tablica.length];
                                    // modulo tablica.length robi z tego circular
    }

    public boolean isEmpty()
    {
        if (poczatek == koniec)
            return true;
        return false;
    }

}
