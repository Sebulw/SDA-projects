public class Stos {

    int[] stos = new int[20];
    int ostatni = 0;

    /*Stos(int rozmiar)
    {
        stos = []new Object[rozmiar];
    }*/

    public int pop()
    {
        return stos[--ostatni];
    }

    public void push(int value)
    {
        stos[ostatni++] = value;
    }

    public boolean isEmpty()
    {
        if (ostatni == 0)
            return true;
        return false;
    }

}
