package main.leetcode.leetcode;

public class leetcode191 {
        public static int hammingWeight(int n) {

            String s=Integer.toBinaryString(n);//Integer.toBinaryString将输入的int值转为二进制形式并返回其字符串形式
            int i=0,num=0;
            while (i<s.length()){
                if (s.charAt(i)=='1'){
                    num+=1;
                }
                i+=1;
            }
            return num;
        }

    public static void main(String[] args){

        int ret= leetcode191.hammingWeight(00000000000000000000000000001011);
        System.out.println(ret);
    }
    }

