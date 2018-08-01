public class Countdown1 implements Runnable {

        public void run() {
            int i = 100;

            while(i > 0) {
                i--;
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
