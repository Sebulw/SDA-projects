public class Brudnopis {

    public static void main(String[] args) {

        /*//Obiekt klasy anonimowej implementującej interface Runnable
        Runnable uruchamialna = new Runnable(){
            public void run() {

                try {
                    Thread.sleep(2000);//Usypia na 2 sekundy
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Uruchomienie powiodło się");
            }
        };*/


/*
        //Tworzenie wątku
        Thread watek = new Thread(uruchamialna);
        watek.start();

        //Tworzenie drugiego wątku z tego samego obiektu
        Thread watek2 = new Thread(uruchamialna);
        watek2.start();

        //To wykona się w głównym wątku programu
        System.out.println("Wystartowałem");

        //Implementacja jako wyrażenie lambda
        Runnable uruchamialna3 = () -> {
            System.out.println("Uruchomienie 2");
        };
        Thread watek3 = new Thread(uruchamialna3);
        watek3.start();*/

    }
}