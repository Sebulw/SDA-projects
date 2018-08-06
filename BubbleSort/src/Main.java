public class Main
{

    public static void main(String[] args)
    {
        int[] tablicaTest1 = {8, 4, 12, 7, 42, 21, 18, 1, 33};
        int[] wynik = Sort.bubbleSort(tablicaTest1);

        for(int w : wynik)
        {
            System.out.println(w);
        }
    }

}
