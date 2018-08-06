public class Sort
{
    public static int[] bubbleSort(int[] tablica)
    {
        int[] tablicaPosortowana = new int[tablica.length];

        //Skopiować dane
        System.arraycopy(tablica, 0, tablicaPosortowana, 0, tablica.length);

        for (int j = tablicaPosortowana.length; j > 1; j--)
            for (int i = 0; i < j-1; i++)
            {
                if (tablicaPosortowana[i] > tablica[i+1])
                {
                    int zamiana = tablicaPosortowana[i];
                    tablicaPosortowana[i] = tablicaPosortowana[i+1];
                    tablicaPosortowana[i+1] = zamiana;


                    /*tablicaPosortowana[i] = tablicaPosortowana[i] ^ tablicaPosortowana[i+1];
                    tablicaPosortowana[i+1] = tablicaPosortowana[i] ^ tablicaPosortowana[i+1];
                    tablicaPosortowana[i] = tablicaPosortowana[i] ^ tablicaPosortowana[i+1];*/
                }
            }

        //Pętla sortująca

        return tablicaPosortowana;
    }
}
