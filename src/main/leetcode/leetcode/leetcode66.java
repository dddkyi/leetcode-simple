package leetcode;

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//        最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
//
//        示例 1:
//
//        输入: [1,2,3]
//        输出: [1,2,4]
//        解释: 输入数组表示数字 123。
//        示例 2:
//
//        输入: [4,3,2,1]
//        输出: [4,3,2,2]
//        解释: 输入数组表示数字 4321。
//public class leetcode66 {
//    public static int[] plusOne(int[] digits) {
//        int[] flag=new int[digits.length+1];
//        int[] digits1=new int[digits.length+1];
//
//        flag[digits.length]=1;
//        OK:
//        if (digits[digits.length-1]==9){
//            int j=digits.length-1;
//            int i=j+1;
//            while (i>0){
//                if (digits[j-1]==digits[j]){
//                    digits1[j+1]=0;
//                    i--;
//                }
//            }
////            if{
////                digits1[j+1]=0;
//                digits1[i]=digits[i-1]+1;
//                break OK;
////            }
//        }
//        else if(digits[digits.length-1]<9){
//            digits1[digits.length]=digits[digits.length-1]+1;
//            for(int i=0;i<digits.length-1;i++){
//                digits1[i+1]=digits[i];
//            }
//        }
//
//        if(digits1[0]==0){
//            int[] digits2=new int[digits1.length-1];
//            for (int i=1;i<digits1.length;i++){
//                digits2[i-1]=digits1[i];
//            }
//            digits1=digits2;
//        }
//        return digits1;
//    }
//
//    public static void main(String[] args){
//        int[] b;
//        int[] s={9,9,9};
//        b=leetcode66.plusOne(s);
//        System.out.println(b);
//    }
//}

//正确解法：
public class leetcode66 {
public int[] plusOne(int[] digits) {

    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        digits[i] = 0;
    }

    int[] newNumber = new int [n+1];
    newNumber[0] = 1;

    return newNumber;
}
}