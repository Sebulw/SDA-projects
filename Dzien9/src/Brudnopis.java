public class Brudnopis {

    public static void main(String[] args) {


        double sumaCzasow = 0;

        for (int j = 0; j < 10; j++) {

            long startTime = System.nanoTime();
            long total = 0;
            for (int i = 0; i < 1_000_000_000; i++) {
                total += i;
            }
            long stopTime = System.nanoTime();
            double elapsedTime = (stopTime - startTime) / 1000000.0;
            System.out.println(elapsedTime);

            sumaCzasow+=elapsedTime;
        }
    }

}


/*
*       podzielić wielkość tablicy na 2
*
*
*
*
*
*
*
* */