public class Main {

    public static void main(String[] args) {

        FIFO kolejka = new FIFO();

        kolejka.enqueue(1);
        kolejka.enqueue(2);
        kolejka.enqueue(3);

        System.out.println(kolejka.dequeue());

        kolejka.enqueue(4);
        kolejka.enqueue(5);
        kolejka.enqueue(6);

        System.out.println(kolejka.dequeue());
        System.out.println(kolejka.dequeue());
        System.out.println(kolejka.dequeue());

    }

}
