package main.leetcode.leetcode;

public class leetcode202 {
    public static boolean isHappy(int n) {
        int low=n,fast=rec(n);
        while(low!=fast){
            low=rec(low);
            fast=rec(fast);
            fast=rec(fast);
        }if(low==1){
            return true;
        }else {
            return false;
        }
    }
    public static int rec(int n) {
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args){
//        int[] nums={2,7,9,3,1};
        boolean ret= leetcode202.isHappy(19);
        System.out.println(ret);
    }
}
