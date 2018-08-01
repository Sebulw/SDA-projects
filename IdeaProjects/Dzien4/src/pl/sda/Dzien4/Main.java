package pl.sda.Dzien4;

public class Main {

    public static void main(String[] args) {

        Prostokat mojProstokat = new Prostokat(10, 3);
        Kwadrat mojKwadrat = new Kwadrat(5);

        System.out.println(mojProstokat.powierzchnia());
        System.out.println(mojKwadrat.powierzchnia());

        Naczynie mojeNaczynie = new Naczynie(300);
        Talerz mojTalerz = new Talerz(100, 200);

        System.out.println(mojeNaczynie.pojemnosc());
        System.out.println(mojTalerz.pojemnosc());

        Mebel mojMebel = new Mebel(200, 120, 100);
        Stol mojStol = new Stol(250, 140, 100, 4);

        mojMebel.wymiary();
        mojStol.wymiary();

    }

}
