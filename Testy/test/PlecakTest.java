import org.junit.Test;
import pl.sda.Plecak;
import pl.sda.Rzecz;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlecakTest {

    @Test
    public void test1() {
        ArrayList<Rzecz> listaRzeczy = new ArrayList<Rzecz>();
        // Pierwszy przypadek testowy:
        System.out.println("TEST1 max poj. 10kg WYNIK:(kg:10, 15$)");
        listaRzeczy.add(new Rzecz(4,5));
        listaRzeczy.add(new Rzecz(5,5));
        listaRzeczy.add(new Rzecz(10,15));
        listaRzeczy.add(new Rzecz(2,2));
        listaRzeczy.add(new Rzecz(3,3));
        listaRzeczy.add(new Rzecz(11,10));
        Plecak plecak1 = new Plecak(listaRzeczy);

        int wynik = plecak1.wybierzBruteForce(10);

        assertEquals(15, wynik);
    }

    @Test
    public void test2() {

        ArrayList<Rzecz> listaRzeczy = new ArrayList<Rzecz>();

        System.out.println("--------------------------------------");
        System.out.println("TEST2 max poj. 10kg WYNIK:(kg:10, 10)");
        listaRzeczy = new ArrayList<Rzecz>();
        listaRzeczy.add(new Rzecz(6,7));
        listaRzeczy.add(new Rzecz(6,7));
        listaRzeczy.add(new Rzecz(5,5));
        listaRzeczy.add(new Rzecz(5,5));
        listaRzeczy.add(new Rzecz(1,1));
        listaRzeczy.add(new Rzecz(1,1));
        Plecak plecak2 = new Plecak(listaRzeczy);

        int rezultat = plecak2.wybierzBruteForce(10);

        assertEquals(10, rezultat);
    }
}
