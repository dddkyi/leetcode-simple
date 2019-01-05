package leetcode;
//报错


//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        int i,j,l;
//        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
//        StringBuffer strs1=new StringBuffer();
//        for(i=0;i<strs.length-1;i++){
//             l=(strs[i].length()>strs[i+1].length())?strs[i+1].length():strs[i].length();
//             for(j=0;j<l;j++) {
//                    if (strs[i].charAt(j)==strs[i+1].charAt(j)){
//                        if(j>strs1.length()-1) {
//                            strs1.append(strs[i].charAt(j));
//                        }
//
//                        else if(j<strs1.length()) {
//                            strs1.delete(j,strs1.length());//stringbuffer的delete包左不包右
//                        }
//                    }
//                    else if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
//                        hm.put(j,false);
//                    }
//
//                    else if (hm.get(0)==false){
//                        strs1.delete(0,strs1.length());
//                    }
//            }
//        }
//        return strs1.toString();
//    }
//}


class leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){//如果strs中只有一个字符串，则返回该字符串
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();//创建一个stringbuffer
        if (strs.length>1) {//输入参数长度大于1
            int len = strs[0].length();//初始化len为第一个字符串长度
            for (int i = 0; i < len; i++) {//对单个字符串遍历
                char curr = strs[0].charAt(i);//定位指定字符
                for (int j = 1; j < strs.length; j++) {//对strs遍历
                    if (strs[j].length()<=i ||strs[j].charAt(i) != curr) {//如果后面字符串长度少于第一个字符串长度 或者第j个字符串的第i位与之前的字符串的第i位不同 则退出循环
                        return sb.toString();//返回stringbuffer           //<=i是因为防止指针指向长度不够的字符串后面的null字符
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {//当前缀相同并且只有当当前字符串为strs最后一个字符串时才向stringbuffer中添加当前字符
                        sb.append(curr);                                    //只有运行到最后一个字符串且字符相等时才会被添加 如果之前有不同字符串则直接退出循环
                    }
                }
            }
        }
        return sb.toString();
    }
}