package main.leetcode.leetcode;

public class leetcode172 {
//    public static int trailingZeroes(int n) {
//        String s1=String.valueOf(n);
//        BigInteger num=new BigInteger(s1);
//        BigInteger num1=new BigInteger("1");
//        BigInteger sum=new BigInteger("1");
//        int j=0;
//        for (int i=n;i>0;i--){
//            sum=sum.multiply(num);
//            num=num.subtract(num1);
//        }
//        String s=String.valueOf(sum);
//        int len=s.length();
//        for(int i=len;i>0;i--){
//            if ('0'==s.charAt(i-1)){
//                j++;
//            }
//            else {
//                return j;
//            }
//        }
//        return j;
//    }


//    巧用2和5因为只有2和5相乘才能得到1个0，将阶乘中的乘数进行分解，得到2和5组合。因为在分解时2的个数一定比5多，所以只看给定数值n分解时可以得到几个5即可得到尾数0的个数
//    使用循环的方式如上所示时由于数据太大导致溢出

    public static int trailingZeroes(int n) {
        int j=0;
        if(n<5){
            return 0;
        }
        else {
            return  j=n/5+trailingZeroes(n/5);//循环除以5来求n中有多少个5
        }
    }











    public static void main(String[] args){
        int n=30;
        int ret= leetcode172.trailingZeroes(n);
        System.out.println(ret);
    }
}
