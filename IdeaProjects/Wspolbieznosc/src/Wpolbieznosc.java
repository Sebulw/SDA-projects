public class Wpolbieznosc {

    public static void main(String[] args) {

        Countdown1  c1 = new Countdown1();
        Countdown2 c2 = new Countdown2();

        Thread watek1 = new Thread(c1);
        watek1.start();

        Thread watek2 = new Thread(c2);
        watek2.start();
    }

}