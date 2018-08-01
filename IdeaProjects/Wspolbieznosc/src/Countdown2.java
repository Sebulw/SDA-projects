public class Countdown2 implements Runnable {

    public void run() {
        int i = 0;

        while(i < 100) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}