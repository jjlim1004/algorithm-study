package algorithm.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TupleSameProduct {
    public int tupleSameProduct(int[] nums) {

        Map<Integer, Integer> map = new HashMap();
        int result = 0;
        int answer = 0;

        if (nums.length < 4) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int mr = 0;
            for (int j = i + 1; j < nums.length; j++) {
                mr = nums[i] * nums[j];
                if (map.containsKey(mr)) {
                    result = map.get(mr);
                    map.put(mr, result + 1);
                } else {
                    map.put(mr, 1);
                }
            }
        }

        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {
            if (map.get(i) > 1) {
                answer += (map.get(i) * (map.get(i) - 1) * 8) / 2; //조합 공식
            }
        }
        return answer;

    }
}
