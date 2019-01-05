package leetcode;

import java.util.Stack;
import java.util.Scanner;
class leetcode20 {

    public static String scanner(){
        String str1="";
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("输入：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
        return str1;
    }


    public static boolean isValid(String s) {

        Stack<Character> st=new Stack<Character>();
        char stpeek,stpeek1,pop;
        boolean bool;
        for (int i=0;i<s.length();i++){
            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if (!st.isEmpty()) {
                stpeek =st.peek();
                stpeek1=s.charAt(i);
                st.push(stpeek1);
                if (stpeek == '('&&stpeek1==')') {
                    st.pop();
                    st.pop();
                }
                else if (stpeek == '['&&stpeek1==']') {
                    st.pop();
                    st.pop();
                }
                else if (stpeek == '{'&&stpeek1=='}') {
                    st.pop();
                    st.pop();
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args){
        String s;
        boolean b;
        s=scanner();
        b=isValid(s);
        System.out.println(b);
    }
}