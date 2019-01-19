package leetcode;

public class leetcode88 {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int j=0;
//        if (n==0){
//            return;
//        }
//        if (m==0){
//            for (;j<n;j++){
//                nums1[j]=nums2[j];
//            }
//            return;
//        }
//        for (int i=0;i<m+j;i++){
//            if (j<n) {
//                if (nums2[j]<nums1[0]){
//                    int k = m + j;
//                    for (k = m + j; k > 0; k--) {
//                        nums1[k] = nums1[k - 1];
//                    }
//                    nums1[0] = nums2[j];
//                    j++;
//                }
//
//                if (nums1[i] <= nums2[j] && nums2[j] < nums1[i+1]) {
//                    int k = m + j;
//                    for (k = m + j; k > i + j; k--) {
//                        nums1[k] = nums1[k - 1];
//                    }
//                    nums1[i + 1] = nums2[j];
//                    j++;
//                }
//            }
//        }
//        if (j<=n-1){
//            while (j<n){
//            nums1[m+j]=nums2[j];
//            j++;
//            }
//        }
//    }

//从后往前排，找出最大的放在最后
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int p=m+n-1;
        while (i>=0&&j>=0) {
            if (nums1[i] >=nums2[j]){
                nums1[p] = nums1[i];
                i--;
                p--;
            }
            else if (nums1[i] < nums2[j]){
                nums1[p] =nums2[j];
                j--;
                p--;
            }
        }
        while (j>=0){
            nums1[p]=nums2[j];
            j--;
            p--;
            }
    }





    public static void main(String[] args){
//        int[] b;
//        b=leetcode88.merge(5);
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        leetcode88.merge(num1,3,num2,3);
        System.out.println(" mmm"+num1);
    }
}
