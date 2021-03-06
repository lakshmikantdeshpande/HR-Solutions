package leetcode.google;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private int majorityElement(int[] nums) {
        int maxCount = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            int count = map.get(num);
            if (count > maxCount) return num;
        }
        return -1;
    }

    private int majorityElementSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
