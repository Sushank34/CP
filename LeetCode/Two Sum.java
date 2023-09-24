import java.util.Arrays;
import java.util.HashMap;
/**
 * <a href="https://leetcode.com/problems/two-sum">Problem link</a>
 * **/
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}