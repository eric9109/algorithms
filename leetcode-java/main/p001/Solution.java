package p001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict =
                new HashMap<>(nums.length*3/2);
        for (int i = 0; i < nums.length; i++) {
            dict.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer idx1 = i;
            Integer idx2 = dict.get(target - nums[i]);
            if (idx2 != null && idx1 < idx2) {
                return new int[]{ idx1, idx2 };
            }
        }
        return null;
    }
}
