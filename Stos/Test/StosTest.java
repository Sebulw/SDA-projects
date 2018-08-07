import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class StosTest {
    @Test
    public void test1(){
        Integer[] wyniki = new Integer[4];
        Stos mojStos = new Stos(20);
        mojStos.push(1);
        mojStos.push(2);
        mojStos.push(3);
        mojStos.push(4);
        wyniki[0] = mojStos.pop();
        wyniki[1] = mojStos.pop();
        wyniki[2] = mojStos.pop();
        wyniki[3] = mojStos.pop();
        assertArrayEquals(new Integer[]{4,3,2,1},wyniki);
    }
    @Test
    public void test2(){
        Integer[] wyniki = new Integer[4];
        Stos mojStos = new Stos(20);
        mojStos.push(1);
        wyniki[0] = mojStos.pop();
        mojStos.push(2);
        wyniki[1] = mojStos.pop();
        mojStos.push(3);
        wyniki[2] = mojStos.pop();
        mojStos.push(4);
        wyniki[3] = mojStos.pop();
        assertArrayEquals(new Integer[]{1,2,3,4},wyniki);
    }
    @Test
    public void test3(){
        Integer[] wyniki = new Integer[4];
        Stos mojStos = new Stos(20);
        mojStos.push(1);
        mojStos.push(2);
        wyniki[0] = mojStos.pop();
        wyniki[1] = mojStos.pop();
        mojStos.push(3);
        mojStos.push(4);
        wyniki[2] = mojStos.pop();
        wyniki[3] = mojStos.pop();
        assertArrayEquals(new Integer[]{2,1,4,3},wyniki);
    }
}