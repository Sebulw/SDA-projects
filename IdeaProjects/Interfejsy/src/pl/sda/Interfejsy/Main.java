package pl.sda.Interfejsy;

public class Main {

    public static void main(String[] args) {

      /*  Kwadrat k = new Kwadrat();
        System.out.println(k.powierzchnia());

        FiguryGeometryczne fk = new Kwadrat();
        System.out.println(fk.powierzchnia());

        k.przedstawSie();
        ((Kwadrat) fk).przedstawSie();     */         //podszywa się pod kwadrat ponieważ fk (figuryGeometryczne nie posiadają metody przedstawSie

        Prostokat p = new Prostokat(6, 9);
        System.out.println(p.powierzchnia());

    }

}
