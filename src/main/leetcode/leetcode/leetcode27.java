package leetcode;

public class leetcode27 {

    public int removeElement(int[] nums, int val) {
            int i,z;
            int j=0;
            int[] nums1=null;
            if(nums.length==0){
                return nums.length;
            }
            for (i=0;i<nums.length;i++){
                if(nums[i]==val){
                    j+=1;
                    continue;
                }
                nums[i-j]=nums[i];
            }
            return nums.length-j;

        }
    }
