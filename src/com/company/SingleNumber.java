package com.company;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {2,2,3};
        System.out.println(singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        int count = 0;
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(countMap.containsKey(nums[i])) {
                count = countMap.get(nums[i]);
                countMap.put(nums[i], ++count);
            } else {
                countMap.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
