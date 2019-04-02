package leetcode;

public class leetcode121 {
//    public static int maxProfit(int[] prices) {
//        int max=0;
//
//        int l=prices.length;
//        if (l==0){
//            return max;
//        }
//        int temp=prices[l-1];
//        int min=prices[l-1];
//        for (int i=l;i>0;i--){
//            if(prices[i-1]>=temp){
//                temp=prices[i-1];
//                min=prices[i-1];
//            }
//            else if(prices[i-1]<temp&&prices[i-1]<min){
//               int max1=temp-prices[i-1];
//               if(max1>max){
//                   max=max1;
//               }
//                min=prices[i-1];
//            }
//        }
//
//        return max;
//    }
//
//    public static void main(String[] args){
//        int a;
//        int[] b={3,3,5,0,0,3,1,4};
//        a=leetcode121.maxProfit(b);
//        System.out.println(a);
//    }
//}

//    动态规划DP
//　　将一个问题拆成几个子问题，分别求解这些子问题，即可推断出大问题的解。

    public static int maxProfit(int[] prices) {
        int min1 = 99999, max1 = 0;
        for (int i=0;i<prices.length;i++) {
            min1 = Math.min(min1, prices[i]);
            max1 = Math.max(prices[i] - min1,max1);
        }
        return max1;
    }
    public static void main(String[] args){
        int a;
        int[] b={3,3,5,0,0,3,1,4};
        a=leetcode121.maxProfit(b);
        System.out.println(a);
    }
}