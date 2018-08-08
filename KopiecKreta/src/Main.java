public class Main {

    public static void main(String[] args) {

        Kopiec nowyKopiec = new Kopiec(100);

        nowyKopiec.wstaw(15);
        nowyKopiec.wstaw(8);
        nowyKopiec.wstaw(3);
        nowyKopiec.wstaw(42);
        nowyKopiec.wstaw(56);
        nowyKopiec.wstaw(21);
        nowyKopiec.wstaw(9);
        nowyKopiec.wstaw(38);
        nowyKopiec.wstaw(16);
        nowyKopiec.wstaw(2);
        nowyKopiec.wstaw(21);
        nowyKopiec.wstaw(34);
        nowyKopiec.wstaw(12);
        nowyKopiec.wstaw(33);

        /*nowyKopiec.wypisz();

        nowyKopiec.zdejmijWierzcholek();*/

        nowyKopiec.wypisz();

        nowyKopiec.sortowanie();


    }
}
