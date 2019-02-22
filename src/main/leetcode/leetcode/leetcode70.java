package leetcode;

public class leetcode70 {
    public static int climbStairs(int n) {
        int i,j,sum=0;
        for (i=0;i<=Math.floor(n/2);i++){
            int sum1=1,sum2=0;
            for (j=n-2*i+1;j>=n-3*i+2;j--){
                sum1*=j;
            }
            for (j=i;j>=1;j--){
                if (sum1==0){
                    sum1=1;
                    sum2=1;
                    break;
                }
                if (sum2==0){
                    sum2=1;
                }
                sum2*=j;
            }
            if (sum2==0){
                sum=1;
            }
            else {
                sum+=sum1/sum2;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int b;
        b=leetcode70.climbStairs(5);
        System.out.println(b);
    }
}
//double d = Math.sqrt(5);
//n = n + 1;
//return (int) ((Math.pow((1 + d) / 2, n) - Math.pow((1 - d) / 2, n)) / d + 0.5);