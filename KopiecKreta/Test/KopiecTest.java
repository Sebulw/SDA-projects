import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KopiecTest {
    @Test
    public void test1() {
        int[] wyniki = new int[6];
        int[] oczekiwaneWyniki = new int[]{90, 13, 77, 1, 10, 15};
        int[] wartosciDoWstawienia = new int[]{10,90,15,1,13,77};

        Kopiec mojKopiec = new Kopiec(6);
        for(int i=0; i< wartosciDoWstawienia.length; ++i) {
            mojKopiec.wstaw(wartosciDoWstawienia[i]);
        }
        for (int i = 0; i <= 5; ++i) {
            wyniki[i] = mojKopiec.pobierzElement(i);
        }
        assertArrayEquals(new int[]{90, 13, 77, 1, 10, 15}, wyniki);

    }
}