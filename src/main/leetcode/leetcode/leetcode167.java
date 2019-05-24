package main.leetcode.leetcode;

public class leetcode167 {
//    public static int[] twoSum(int[] numbers, int target) {
//超出时间限制
//        int[] ret=new int[2];
//        for(int i=0;i<numbers.length;i++){
//            for (int j=i+1;j<numbers.length;j++){
//                if (numbers[i]+numbers[j]==target){
//                    ret[0]=i+1;
//                    ret[1]=j+1;
//
//                    return ret;
//                }
//                else if(numbers[i]>target){
//                    return ret;
//                }
//            }
//        }
//
//    return ret;
//    }
public static int[] twoSum(int[] numbers, int target) {

    int[] ret=new int[2];
    int start=0,last=numbers.length-1;
    while (start!=last) {
        if (numbers[start] + numbers[last] > target) {
            last--;
        } else if (numbers[start] + numbers[last] < target) {
            start++;
        } else if (numbers[start] + numbers[last] == target) {
            ret[0] = start + 1;
            ret[1] = last + 1;
            return ret;
        }
    }
    return ret;
}

    public static void main(String[] args){
        int[] ret;
        int[] numbers={3,24,50,79,88,150,345};
        int target=200;
        ret= leetcode167.twoSum(numbers,target);
        System.out.println(ret);
    }
}
