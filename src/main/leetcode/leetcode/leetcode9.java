package main.leetcode.leetcode;

//class Solution {
//    public boolean isPalindrome(int x) {
//
//        int sum=0;
//        boolean b=true;
//        if (x>=0){
//             while(x/10!=0){
//                 int y=x%10;
//                  sum=sum*10+y;
//             }
//         }
//        if (sum==x){
//            b=true;
//
//        }else {
//            b=false;
//        }
//        return b;
//    }
//}超时报错  未考虑整数溢出问题
class leetcode9 {
       public boolean isPalindrome(int x) {
            String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString();//string.valueOf返回int参数的字符串表示 reverse()转置 toString()输出为字符串形式
             return reverseNumber.equals(String.valueOf(x));
       }
}