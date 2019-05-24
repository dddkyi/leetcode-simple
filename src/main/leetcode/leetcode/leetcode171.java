package main.leetcode.leetcode;

public class leetcode171 {
    public static int titleToNumber(String s) {
        int j=1;
        int len=s.length();
        int sum=0;
        for (int i=len;i>0;i--){
            int num=((int)(s.charAt(i-1))-64)*j;
            sum+=num;
            j*=26;
        }
        return sum;
    }

    public static void main(String[] args){
        String s="ZY";
        int ret= leetcode171.titleToNumber(s);
        System.out.println(ret);
    }
}
