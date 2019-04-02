package main.leetcode.leetcode;

public class leetcode122 {
//    public static int maxProfit(int[] prices) {
//            int max=0,sum=0;
//
//            int l=prices.length;
//            if (l==0){
//                return max;
//            }
//            int temp=prices[l-1];
//            int min=prices[l-1];
//            for (int i=l;i>0;i--){
//                if(prices[i-1]>=temp){
//                    temp=prices[i-1];
//                    min=prices[i-1];
//                }
//                else if(prices[i-1]<temp){
//                    int max1=temp-prices[i-1];
//                    sum+=max1;
//                    temp=prices[i-1];
//                    min=prices[i-1];
//                }
//            }
//
//            return sum;
//    }

//    贪心算法
public static int maxProfit(int[] prices) {
    int len = prices.length, sum1 = 0, sum = 0;

    for (int i = 0; i < len-1; i++) {
        sum1 = (prices[i + 1] > prices[i]) ? prices[i + 1] - prices[i] : 0;
        sum += sum1;
    }
    return sum;
}

    public static void main(String[] args){
        int a;
        int[] b={7,1,5,3,6,4};
        a= leetcode122.maxProfit(b);
        System.out.println(a);
    }

}
