import org.junit.Test;

import java.util.Arrays;

public class JavaTest {


    private void test(Integer R[], Integer n) {
        Integer i, t;
        for (i = 0; i < n - 1; i++) {
            while (R[i] != i) {
                t = R[R[i]];
                R[R[i]] = R[i];
                R[i] = t;
            }
        }
        System.out.println(Arrays.toString(R));

    }


    @Test
    public void test1() {
        Integer[] L = {3, 0, 5, 1, 6, 4, 2, 7};
        test(L, 8);
    }

}
