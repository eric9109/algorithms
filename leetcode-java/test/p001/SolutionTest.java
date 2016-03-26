package p001;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{0, 1},
                s.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
