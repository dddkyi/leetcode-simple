package leetcode;
public class leetcode28 {
    public static int strStr(String haystack, String needle) {

        int hayi;//haystack指针
        int i;//匹配后haystack指针
        int neei;//needle指针
        int ni=0;//匹配后needle指针
        int start=-1;//开始指针
        int flag=0;//标志位用于判断是否退出
        if(needle.length()==0){//若needle为空字符串，则开始位置为0
            return start=0;
        }
        if(needle.length()>haystack.length()){//判断needle长度是否比haystack长度大
            return start=-1;
        }
        OK:
        for (hayi=0;hayi<haystack.length();hayi++){//对daystack遍历
            i=hayi;
            if(haystack.charAt(hayi)==needle.charAt(0)&&haystack.length()-i>=needle.length()){//若haystack匹配到needle的首字母并且haystack剩余的字母长度大于needle的长度
                    ni=0;//每次匹配都先初始化ni
                    while(haystack.charAt(i)==needle.charAt(ni)&&ni<needle.length()){//当haystack与needle对应的字母相同并且needle指针不会超出needle长度时进行循环
                        i++;
                        ni++;
                        if(i-hayi==needle.length()){//匹配后如果haystack的长度正好等于needle长度时
                            flag++;//将标志位加1
                            start=hayi;//将开始标志位置为开始进入循环时的haystack的位置
                            break OK;//退出多重循环
                        }
                    }
                }
        }
        if (hayi==haystack.length()-1&&flag==0){//若遍历到最后并且标志位仍为0
            return start=-1;
        }
//        }

        return start;
    }

    public static void main(String[] args){
        String haystack,needle;
        int b;
//        haystack=Scanner.Scanner("haystack");
//        needle=Scanner.Scanner("needle");
        b=leetcode28.strStr("aaaa","bba");
        System.out.println(b);
    }
}
//解法1
//class Solution {
//    public:
//    int strStr(string haystack, string needle) {
//        if (needle.size()==0)
//            return 0;
//        if (needle.size() > haystack.size())
//            return -1;
//        int j=0;//needle指针
//        int i=0;
//        for (i = 0; i < haystack.size(); ++i) {
//            if (j==needle.size()){//判断完成
//                return i - needle.size();
//            }
//            if (haystack[i] == needle[j]){//每次匹配都将needle指针 加1
//                j++;
//            } else{//若不匹配则退回
//                i -= j;
//                j=0;
//            }
//        }
//        if (j==needle.size()){//判断完成
//            return i - needle.size();
//        }
//        return -1;
//    }
//};
//解法2
//class Solution {
//    public:
//    int strStr(string haystack, string needle) {
//        if(needle=="")return 0;
//        int len1 = haystack.size();
//        int len2 = needle.size();
//        if (len1 < len2)return -1;
//        int index = 0;
//        for (int i = index; i <=len1-len2; i++)
//        {
//            index = i;
//            for (int j = 0; j < len2; j++)
//            {
//                if (haystack[i] != needle[j])
//                {
//                    break;
//                }
//                else
//                {
//                    i++;
//                    if (j == len2 - 1)return index;
//                }
//            }
//            i = index;
//        }
//
//        return -1;
//    }
//};