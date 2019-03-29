package leetcode;

public class leetcode121 {
    public static int maxProfit(int[] prices) {
        int max=0;

        int l=prices.length;
        if (l==0){
            return max;
        }
        int temp=prices[l-1];
        int min=prices[l-1];
        for (int i=l;i>0;i--){
            if(prices[i-1]>=temp){
                temp=prices[i-1];
                min=prices[i-1];
            }
            else if(prices[i-1]<temp&&prices[i-1]<min){
               int max1=temp-prices[i-1];
               if(max1>max){
                   max=max1;
               }
                min=prices[i-1];
            }
        }

        return max;
    }

    public static void main(String[] args){
        int a;
        int[] b={3,3,5,0,0,3,1,4};
        a=leetcode121.maxProfit(b);
        System.out.println(a);
    }
}
