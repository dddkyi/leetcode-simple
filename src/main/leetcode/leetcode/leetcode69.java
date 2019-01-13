package leetcode;

//方法一：遍历0到x所有整数，强制类型转换
//方法二：二分法
//方法三:牛顿法
public class leetcode69 {
    public static int mySqrt(int x) {
        long l1,l2;
        for(long i=0;i<=x;i++){
//        int i=46340;
//        System.out.println(i*i+","+(i+1)*(i+1));
            l1=(long)i*i;
            l2=(long)(i+1)*(i+1);
            if (l1<=x&&l2>x){
                return (int)i;
            }

        }
        //}
        return 0;
    }
    public static void main(String[] args){
        int b;
        b=leetcode69.mySqrt(2147395600);
        System.out.println(b);
    }
}
