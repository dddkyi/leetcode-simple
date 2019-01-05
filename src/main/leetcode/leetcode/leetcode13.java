package leetcode;

import java.util.ArrayList;

class leetcode13 {



    public int romanToInt(String s) {
        int i=0;
        int sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i<s.length()) {
            switch (s.charAt(i)) {
                case 'I':
                    list.add(i,1);
                    break;
                case 'V':
                    list.add(i,5);
                    break;
                case 'X':
                    list.add(i,10);
                    break;
                case 'L':
                    list.add(i,50);
                    break;
                case 'C':
                    list.add(i,100);
                    break;
                case 'D':
                    list.add(i,500);
                    break;
                case 'M':
                    list.add(i,1000);
                    break;
            }
            i++;
        }
        for(i=0;i<s.length()-1;i++){
            if (list.get(i)<list.get(i+1)){
                sum-=list.get(i);
            }
            else if(list.get(i)>=list.get(i+1)){
                sum+=list.get(i);
            }
        }

        sum+=list.get(list.size() - 1);
        return sum;
    }
}//罗马数字转整数，核心在于