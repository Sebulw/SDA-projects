import javax.sound.midi.Soundbank;

public class Drzewo {
    String nazwa;
    Wezel korzen;

    public Drzewo(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public void dodajWezel(Wezel rodzic, Wezel dziecko)
    {
        rodzic.dzieci.add(dziecko);
    }

    public void wypiszDzieci(Wezel start, int spacji)
    {
        for(int i = 0; i < spacji; ++i)
            System.out.print("  ");

        System.out.println(start.dane);

        for (Wezel w : start.dzieci)
        {
            wypiszDzieci(w, spacji+4);
        }
    }

}
