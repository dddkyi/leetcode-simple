package leetcode;


class leetcode1 {
    public int[] twoSum(int[] nums, int target) {

        int[] list;
        list=new int[2];
        int l=nums.length;
        for (int i=0;i<l;i++){
            for (int j=i+1;j<l;j++){
                if (nums[i]+nums[j]==target) {
                  list[0]=i;
                  list[1]=j;
                }
            }
        }
        return list;
    }
}

//两遍哈希表解法
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

//一遍哈希表解法
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }