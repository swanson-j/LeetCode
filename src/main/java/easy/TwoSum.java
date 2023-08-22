package easy;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSumBrute(int[] nums, int target) {
        int[] out = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }

        return null;
    }

    public int[] twoSumWithMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], i);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(map.get(target - nums[i]) != null && map.get(target - nums[i]) != i)
                return new int[] {i, map.get(target - nums[i])};
        }

        return null;
    }
}