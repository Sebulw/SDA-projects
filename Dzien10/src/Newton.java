public class Newton {

    static int[][] zapamietane = new int [100][100];

    public static int newton(int w, int k)
    {
        // sprawdź czy w tablicy nie ma już wyliczonej wartości dla [w] i [k]
        //jeśli jest to ją zwóć

        if (zapamietane[w][k] != 0)
        {
            return zapamietane[w][k];
        }

        if (k == 0 || k == w)
            return 1;
        else {
            //wyliczoną wartość wpisz do tablicy pod indexem [w][k]
            zapamietane[w][k] = newton(w, k-1) + newton(w-1, k-1);
            return
                    zapamietane[w][k];
        }
    }

}
