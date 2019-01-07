package leetcode;
import java.util.*;
import java.util.ArrayList;

public class leetcode53 {
    public static int maxSubArray(int[] nums) {
        int max=0;
        ArrayList<Integer> sums=new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                    int sum=0;
                    max=nums[i];
                    for (int j=i;j<nums.length;j++){
                        sum+=nums[j];
                        if (sum>max){
                            max=sum;
                        }
                    }
                sums.add(max);
            }
        Collections.sort(sums);//对sums数组进行排序
        return sums.get(sums.size()-1);
    }

    public static void main(String[] args){
        int b;
        int[] nums={-2,-1};
        b=leetcode53.maxSubArray(nums);
        System.out.println(b);
    }
}
//动态规划法
//class Solution {
//    public:
//    int maxSubArray(vector<int>& nums) {
//        if(nums.size() == 0) return NULL;
//        int res = INT_MIN;//设res参数表示最大和的数值
//        int f_n = -1;//设f_n参数表示子字符串相加之和
//        for(int i = 0; i < nums.size(); ++i){
//            f_n = max(nums[i], f_n + nums[i]);//将子字符串相加之和与当前所指向数值比较大小，，若和大，则相当于继续相加，若当前数值大，则从当前数值重新开始相加
//            res = max(f_n, res);//将当前子字符串之和与之前和的最大值进行比较，返回大的那个数值
//        }
//        return res;
//    }
//};