package leetcode;

public class leetcode38 {
    public static String countAndSay(int n) {
        StringBuilder ListA = new StringBuilder();
        StringBuilder ListB = new StringBuilder();
        int count = 1, j = 0,i=0;
        ListA.append("1");
        if (n==1){
            return ListA.toString();
        }
        for (int z = 0; z < n-1; z++) {
                while (i<ListA.length()) {
                    if ( i<ListA.length()-1) {
                        while (ListA.charAt(i) == ListA.charAt(i + 1)) {
                            count++;
                            i++;
                            if(i>=ListA.length()-1){
                                break;
                            }
                        }
                    }
                ListB.append(String.valueOf(count));
                ListB.append(ListA.charAt(i));
                i++;
                count = 1;
                }
            ListA =ListB;
            ListB=new StringBuilder();//注意不能直接清空ListB，上一行代码为浅复制，可以通过新建对象来实现清空StringBuilder
            i=0;
        }
        return ListA.toString();
    }

    public static void main(String[] args){
        String b;
        b=leetcode38.countAndSay(4);
        System.out.println(b);
    }

}
