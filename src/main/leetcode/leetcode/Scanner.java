package leetcode;

public class Scanner {
    public static String Scanner(String s){
        String str1="";
        java.util.Scanner scan = new java.util.Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("输入：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            str1 = scan.next();
            System.out.println(s+"输入的数据为：" + str1);
        }
        scan.close();
        return str1;
    }
}
