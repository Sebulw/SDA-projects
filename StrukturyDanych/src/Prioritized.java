public class Prioritized extends FIFO{

    FIFO[] kolejki = new FIFO[3];

    Prioritized() {
        for (int i=0; i<3; i++)
        {
            kolejki[i] = new FIFO();
        }
    }

    public void enqueue(int value, int priorytet)
    {
        kolejki[priorytet].enqueue(value);
    }

    public int dequeue()
    {
        /*int i;                                            // Sposób na odkolejkowanie w forem, ogarnąć w domu
        for (i=2; kolejki[i].isEmpty() && i>=0; --i);

        return kolejki[i].dequeue();*/


        if (! kolejki[2].isEmpty())
        {
            return kolejki[2].dequeue();
        }
        else if (! kolejki[1].isEmpty())
        {
            return kolejki[1].dequeue();
        }
        else if (! kolejki[0].isEmpty())
        {
            return kolejki[0].dequeue();
        }

        return -1;
    }

}
