package main.leetcode.leetcode;

public class leetcode198 {
//    public static int rob(int[] nums) {
//
//        int i=0,sum0=0,sum1=0;
//        while (i<nums.length){
//            if(i%2==0){
//                sum0+=nums[i];
//                i++;
//            }
//            else if(i%2!=0){
//                sum1+=nums[i];
//                i++;
//            }
//        }
//        return sum0>sum1?sum0:sum1;
//    }



//    public static int rob(int[] nums) {
//        int i=nums.length-1;
//        if(i==0){return nums[0];}
//        if (i==1){return Math.max(nums[0],nums[1]);}
//        while (i>1) {
//            return Math.max(nums[i] + rob(Arrays.copyOfRange(nums, 0, i - 2)), rob(Arrays.copyOfRange(nums, 0, i - 1)));
//        }
//        return 0;
//    }

    public static int rob(int[] nums) {
        int n=nums.length;
        int[] mem=new int[n];
        if (n<=1)return n==0?0:nums[0];
        mem[0]=nums[0];
        mem[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<n;i++){
            mem[i]=Math.max(mem[i-1],nums[i]+mem[i-2]);
        }
        return mem[n-1];
    }





    public static void main(String[] args){
        int[] nums={2,7,9,3,1};
        int ret= leetcode198.rob(nums);
        System.out.println(ret);
    }
}
