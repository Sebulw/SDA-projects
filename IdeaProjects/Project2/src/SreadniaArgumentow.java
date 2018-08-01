public class SreadniaArgumentow {

        /*public static int suma(int argument1, int...argumenty) {
            int suma = argument1;
            for (int i = 0; i < argumenty.length; i++) {
                suma += argumenty[i];
            }
            return suma;
        }*/

        /*public static double srednia(int argument1, int...argumenty) {
            double suma = argument1;
            for (int i = 0; i < argumenty.length; i++) {
                suma += argumenty[i];
            }
            return suma / (argumenty.length+1);
        }*/

        public static int minWartosc(int argument1, int...argumenty) {
            int min = argument1;
            for (int i = 0; i < argumenty.length; i++) {
                if (min > argumenty[i])
                    min = argumenty[i];

            }return min;
        }

        public static int maxWartosc(int argument1, int...argumenty) {
            int max = argument1;
            for (int i = 0; i < argumenty.length; i++) {
                if (max < argumenty[i])
                    max = argumenty[i];
            }return max;
        }

        public static void  main(String[] args) {
            //System.out.println(suma(1 ,2,3,5,10));
            //System.out.println(srednia(1 ,2,3,5,10));
            System.out.println(minWartosc(4 ,2,3,5,10));
            System.out.println(maxWartosc(4 ,2,3,5,10));
        }

}
