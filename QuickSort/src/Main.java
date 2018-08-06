public class Main {

    public static void main(String[] args) {

        int[] tablicaTest = {5, 5, 2, 1, 7, 20, 90, 100, 5, 3, 6,32, 62, 16};
        int[] wynik = Sort.quickSortStart(tablicaTest);

        for(int w : wynik)
        {
            System.out.println(w);
        }


    }

}
