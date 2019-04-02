package main.leetcode.leetcode;

public class leetcode125 {
    public static boolean isPalindrome(String s) {
//        Stack<Character> stack=new Stack<>();
        String ss= s.replaceAll("[\\pP\\p{Punct}]","");
        String s1=ss.toLowerCase();
        String s11=s1.replace(" ","");
        String s1pre= s11.substring(0,s11.length()/2);
        StringBuilder s2 = new StringBuilder(s1pre);
        String s2r=s2.reverse().toString();

        if(s11.length()%2==0){
            String s1back= s11.substring(s11.length()/2);
            if (s2r.equals(s1back)){
                return true;
            }
        }
        if(s11.length()%2!=0){
            String s1back= s11.substring(s11.length()/2+1);
            if (s2r.equals(s1back)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        boolean a;
        String b="";
        a= leetcode125.isPalindrome(b);
        System.out.println(a);
    }
}
