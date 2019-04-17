package main.leetcode.leetcode;

//public class leetcode136 {
//    public static Integer singleNumber(Integer[] nums) {
//
//        ArrayList<Integer> nums1= new ArrayList<Integer>(Arrays.asList(nums));
//        int len=nums.length;
//        int i=0,j=0;
//
//            for(j=i+1;j<len;j++){
//                if(nums1.size()==1){
//                    break;
//                }
//                if(nums1.get(i)==nums1.get(j)){
//                    nums1.remove(i);
//                    nums1.remove(j-1);
//                }
//                else {
//                    i++;
//                }
//            }
//        int one=(int)nums1.get(0);
//        return one;
//    }
//
//    public static void main(String[] args){
//        Integer[] nums={2,2,1};
//        int a= leetcode136.singleNumber(nums);
//        System.out.println(a);
//    }
//}
public class leetcode136 {
    public static int singleNumber(int[] nums) {

        int a=0;
        int len=nums.length;
        int i=0;
        while (i<len){
            a=a^nums[i];
            i++;
        }
        return a;
    }
}
