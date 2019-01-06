package leetcode;

public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        int min=0,max=nums.length-1,middle;
        if (target<=nums[0]){
            return 0;
        }
        if (target>nums[max]){
            return max+1;
        }
        if (target==nums[max]){
            return max;
        }
        for(int i=0;i<nums.length/2;i++) {
            if (nums[min] < target && target < nums[max]) {
                middle = min + (int) Math.floor((max - min) / 2);
                if (target == nums[middle]) {
                    return middle;
                } else if (target > nums[middle]) {
                    min = middle;
                } else if (target < nums[middle]) {
                    max = middle;
                }

            }
        }
        if (max - 1 == min && target != nums[max]) {
            return max;
        }
    return max;
    }

    public static void main(String[] args){
        int b;
        int[] nums={1,3,5,6};
        b=leetcode35.searchInsert(nums, 5);
        System.out.println(b);
    }
}

//数组长度少的情况下
//public int searchInsert(int[] nums, int target) {
//    for(int i = 0; i < nums.length;i++){
//        if(nums[i] >= target){
//            return i;
//        }
//    }
//    return nums.length;
//}
