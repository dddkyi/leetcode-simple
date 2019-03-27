package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> B=new ArrayList<Integer>();
        List<Integer> C=new ArrayList<Integer>();

        Queue<Integer> q = new LinkedList<Integer>();
        int sum=1;

        if(rowIndex==0){
            B.add(1);
            return B;
        }
        if(rowIndex==1){
            B.add(1);
            B.add(1);
            return B;
        }
        if(rowIndex>=2) {
//            q.add(1);
            for (int i = 0; i < rowIndex; i++) {
                for (int j = 0; j < i; j++) {
                    int a=0;
                    a = ((LinkedList<Integer>) q).poll();
                    sum += a;
                    ((LinkedList<Integer>) q).offer(sum);
                    sum = a;
                }
                sum = 1;
                ((LinkedList<Integer>) q).offer(1);
            }
        }
        B.add(1);
        C=(List)q;
        B.addAll(C);
        return B;
    }

    public static void main(String[] args){
        List<Integer> a=new ArrayList<>();
        a=leetcode119.getRow(2);
        System.out.println(a);
    }
}
