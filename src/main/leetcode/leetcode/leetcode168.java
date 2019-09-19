package main.leetcode.leetcode;

public class leetcode168 {
//    public static String convertToTitle(int n) {
//        String str="";
//        char a=0;
////        if (n/26<1&&n%26!=0){
//        if (n/27<1){
//            a+=n%27+64;
//            str+=a;
//        }
////        else if (n/26<=27&&n/26>=1){
//        else if (n/26>=1){
//            a+=n/26+64;
//            if((n%26)%26==0){
//                a--;
//            }
//            str+=a;
////            int i=(n/27>=1)?n/26:1;
//            int i=(n%26==0)?26:n%26;
////            str+=convertToTitle(n-26*i);
//            str+=convertToTitle(i);
//        }
//
//        return str;
//    }

//抄自答题区
    public static String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n =n / 26;
        }
        return sb.reverse().toString();
    }




    public static void main(String[] args){

        String ret= leetcode168.convertToTitle(703);
        System.out.println(ret);
    }
}
