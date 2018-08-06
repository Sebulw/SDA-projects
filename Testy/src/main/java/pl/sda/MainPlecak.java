package pl.sda;
import java.util.ArrayList;
public class MainPlecak {
    public static void main(String[] args) {
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
        System.out.println("Suma wartosci plecaka1:"+plecak1.wybierzBruteForce(10));
        //-------------------------------------------
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
        System.out.println("Suma wartosci plecaka2:"+plecak2.wybierzBruteForce(10));
        //-------------------------------------------
        System.out.println("--------------------------------------");
        System.out.println("TEST3 max poj. 10kg WYNIK:(kg:10, 9$)");
        listaRzeczy = new ArrayList<Rzecz>();
        listaRzeczy.add(new Rzecz(1,1));
        listaRzeczy.add(new Rzecz(2,2));
        listaRzeczy.add(new Rzecz(3,3));
        listaRzeczy.add(new Rzecz(5,4));
        listaRzeczy.add(new Rzecz(1,0));
        listaRzeczy.add(new Rzecz(1,1));
        Plecak plecak3 = new Plecak(listaRzeczy);
        System.out.println("Suma wartosci plecaka3:"+plecak3.wybierzBruteForce(10));
    }
}