
package leetcode;
public class leetcode26 {
    public int removeDuplicates(int[] nums) {

        int i;
        int j=0;
        int[] nums1=null;
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        for (i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                j+=1;
            }
            nums[i+1-j]=nums[i+1];
        }
        return nums.length-j;
    }
}
