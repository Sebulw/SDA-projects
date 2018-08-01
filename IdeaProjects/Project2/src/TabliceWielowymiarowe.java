public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        char[][] tablica = new char[6][10];

        for (int wiersze=0; wiersze< tablica.length; wiersze++)
            for (int kolumny=0; kolumny< tablica[wiersze].length; kolumny++)
                tablica[wiersze][kolumny]=' ';

        tablica[3][3]='x';
        tablica[4][4]='x';
        tablica[4][5]='x';
        tablica[4][6]='x';
        tablica[3][7]='x';

        for (int wiersze = 0; wiersze < tablica.length; wiersze++) {
            for (int kolumny = 0; kolumny < tablica[wiersze].length; kolumny++) {
                System.out.print(tablica[wiersze][kolumny]);
            }
            System.out.println();
        }
    }
}
