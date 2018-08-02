public class Main {

    public static void main(String[] args) {

        Lista mojaLista = new Lista();

        mojaLista.wstaw(15);
        mojaLista.wstaw(5);
        mojaLista.wstaw(2);
        mojaLista.wstaw(8);

        ElementListy element = mojaLista.szukaj(8);

        mojaLista.wypiszListe();

    }

}
