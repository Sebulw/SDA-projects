import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Rzecz> listaRzeczy = new ArrayList<Rzecz>();

        // Pierwszy przypadek testowy:
        //listaRzeczy.add(new Rzecz(6, 7));
        //listaRzeczy.add(new Rzecz(6, 7));
        listaRzeczy.add(new Rzecz(5, 5));
        listaRzeczy.add(new Rzecz(5, 5));

        Plecak plecak1 = new Plecak(listaRzeczy);

        plecak1.wypiszWybraneElementy(10);
        System.out.println("suma wartości plecaka: "+plecak1.sumaWartosci(10));

    }

}
