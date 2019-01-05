package leetcode;
//错误
//class Solution {
//    public int reverse(int x) {
//        Stack<Integer> st = new Stack<Integer>();
//        while(x/10!=0){
//            st.push(x%10);
//        }
//        while (!st.empty()){
//
//           String[] str=st.pop();
//           int i = Integer.parseInt(str);
//
//        }
//        return i;
//    }
//
//}

//官方解法
class leetcode7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;//判断rev不超过int的最大值
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;//判断rev不超过int的最小值
            rev = rev * 10 + pop;
        }
        return rev;
    }
}