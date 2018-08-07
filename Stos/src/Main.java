public class Main {

    public static void main(String[] args) {

        Stos stos = new Stos();

        stos.push(5);
        stos.push(15);
        stos.push(25);
        stos.push(2);

        System.out.println(stos.pop());

        stos.push(32);

        System.out.println(stos.pop());
        System.out.println(stos.pop());

    }

}
