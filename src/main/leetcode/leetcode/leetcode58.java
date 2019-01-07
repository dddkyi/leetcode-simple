package leetcode;

public class leetcode58 {
    public static int lengthOfLastWord(String s) {

        int count=0,j=0,sum=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '&&i==s.length()-1){
                return sum;
            }else if(s.charAt(i)==' '){
                count=0;
                j++;
            }else {
                count++;
                j=0;
            }
            if(j==0){
                sum=count;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int b;
        String s="a  ";
        b=leetcode58.lengthOfLastWord(s);
        System.out.println(b);
    }
}
