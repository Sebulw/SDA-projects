import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Tworzymy zmienną o typie interfejsu i inicjalizujemy:
        List<String> komputery = new LinkedList<>();
        komputery.add("ZX Spectrum");
        komputery.add("Commodore 64");

        List<String> ulubione = new LinkedList<>();
        ulubione.add("Commodore 64");

        ulubione.addAll(komputery);
        System.out.println(ulubione.get(1));
        System.out.println(ulubione.indexOf("Commodore 64"));

    }

}
