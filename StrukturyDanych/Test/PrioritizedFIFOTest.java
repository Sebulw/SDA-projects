import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class PrioritizedFIFOTest {

    @Test
    public void test1(){

        Prioritized kolejkaPriorytetowa = new Prioritized();

        Integer[] wyniki = new Integer[7];
        kolejkaPriorytetowa.enqueue(1,0);
        kolejkaPriorytetowa.enqueue(2,1);
        kolejkaPriorytetowa.enqueue(3,2);
        kolejkaPriorytetowa.enqueue(4,1);
        kolejkaPriorytetowa.enqueue(5,1);
        kolejkaPriorytetowa.enqueue(6,0);

        wyniki[0] = kolejkaPriorytetowa.dequeue();
        wyniki[1] = kolejkaPriorytetowa.dequeue();
        wyniki[2] = kolejkaPriorytetowa.dequeue();
        wyniki[3] = kolejkaPriorytetowa.dequeue();
        wyniki[4] = kolejkaPriorytetowa.dequeue();

        kolejkaPriorytetowa.enqueue(7,2);

        wyniki[5] = kolejkaPriorytetowa.dequeue();
        wyniki[6] = kolejkaPriorytetowa.dequeue();

        assertArrayEquals(new Integer[]{3,2,4,5,1,7,6},wyniki);
    }
}