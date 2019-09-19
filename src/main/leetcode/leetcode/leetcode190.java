package main.leetcode.leetcode;

public class leetcode190 {
        public static int reverseBits(int n) {

//            String s=Integer.toBinaryString(n);//Integer.toBinaryString将输入的int值转为二进制形式并返回其字符串形式
//            String reverse = new StringBuffer(s).reverse().toString();
//            int i = Integer.parseInt(reverse);
            int i=Integer.reverse(n);
            return i;
        }
}

