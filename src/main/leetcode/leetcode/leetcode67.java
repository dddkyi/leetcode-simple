package leetcode;

import java.util.Stack;

public class leetcode67 {
    public static String addBinary(String a, String b) {

        Stack stack=new Stack();
        int len,len1=0;
        String str="";
        int flag1=0;
        int alen=a.length();
        int blen=b.length();
        len=(a.length()>=b.length())?b.length():a.length();
        int[] flag=new int[len+1];
        for (int i=0;i<len;i++){//对两个字符串相同长度比较

            if(a.charAt(alen-i-1)==b.charAt(blen-i-1)&&a.charAt(alen-i-1)=='1'&&flag[len-i]==1){
                stack.push(1);
                flag[len-i-1]=1;
            }
            else if((a.charAt(alen-i-1)!=b.charAt(blen-i-1)&&flag[len-i]==1)||(a.charAt(alen-i-1)==b.charAt(blen-i-1)&&a.charAt(alen-i-1)=='1'&&flag[len-i]==0)){
                stack.push(0);
                flag[len-i-1]=1;
            }
            else if((a.charAt(alen-i-1)!=b.charAt(blen-i-1)&&flag[len-i]==0)||(a.charAt(alen-i-1)==b.charAt(blen-i-1)&&a.charAt(alen-i-1)=='0'&&flag[len-i]==1)){
                stack.push(1);
            }
            else if(a.charAt(alen-i-1)==b.charAt(blen-i-1)&&a.charAt(alen-i-1)=='0'&&flag[len-i]==0){
                stack.push(0);
            }
        }
//对两个字符串不同部分进行比较
        if(a.length()>len) {
            len1 = a.length() - len;
            if(len1>0) {
                if (flag[0] == 1) {
                    flag1 = 1;
                    flag[0]=0;
                }
                for (int i = len1-1; i >= 0; i--) {
                    if (a.charAt(i) == '1' && flag1 == 1) {
                        stack.push(0);
                        flag1 = 1;
                    } else if ((a.charAt(i) == '0' && flag1 == 1) || (a.charAt(i) == '1' && flag1 == 0)) {
                        stack.push(1);
                        flag1 = 0;
                    } else if (a.charAt(i) == '0' && flag1 == 0) {
                        stack.push(0);
                        flag1 = 0;
                    }
                }
            }
        }else if(b.length()>len){
            len1 = b.length() - len;
            if(len1>0) {
            if (flag[0] == 1) {
                flag1 = 1;
                flag[0]=0;
            }
            for (int i = len1-1; i >= 0; i--) {
                if (b.charAt(i) == '1' && flag1 == 1) {
                    stack.push(0);
                    flag1 = 1;
                } else if ((b.charAt(i) == '0' && flag1 == 1) || (b.charAt(i) == '1' && flag1 == 0)) {
                    stack.push(1);
                    flag1 = 0;
                } else if (b.charAt(i) == '0' && flag1 == 0) {
                    stack.push(0);
                    flag1 = 0;
                }
            }
        }
        }
        //添加进字符串
        if(flag1==1||flag[0]==1){
            str=str+"1";
        }
        while (!stack.empty()){
            str=str+stack.pop();
        }

    return str;
    }


    public static void main(String[] args){
        String b;
        String s="a  ";
        b=leetcode67.addBinary("1","111");
        System.out.println(b);
    }
}
