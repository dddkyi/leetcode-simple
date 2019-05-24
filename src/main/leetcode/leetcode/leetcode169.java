package main.leetcode.leetcode;

import java.util.HashMap;

public class leetcode169 {
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int len=nums.length;
        for (int j=0;j<len;j++){
            while (j<len){
                if(hashmap.containsKey(nums[j])==true){
                    hashmap.replace(nums[j],hashmap.get(nums[j])+1);
                    j++;
                }
                else if(hashmap.containsKey(nums[j])!=true){
                    hashmap.put(nums[j], 1);
                    j++;
                }
            }
        }

        for(Integer i : hashmap.keySet()){
            if(hashmap.get(i)>len/2){
                return i;
            }
        }

        return 1;
    }


    public static void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        int ret= leetcode169.majorityElement(nums);
        System.out.println(ret);
    }
}
