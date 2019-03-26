package leetcode;

import java.util.*;

public class leetcode118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> A=new ArrayList<List<Integer>>();
        ArrayList<Integer> B=new ArrayList<Integer>();
//        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> C=new ArrayList<Integer>();

        if(numRows==1){
            B.add(1);
            A.add(B);
            return A;
        }
        if(numRows==2){
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            B.add(1);
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            return A;
        }
        if(numRows==3){
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            B.add(1);
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            B.add(1);
            B.add(2);
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            return A;
        }
        if(numRows>3){
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            B.add(1);
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            B.add(1);
            B.add(2);
            B.add(1);
            C=(ArrayList<Integer>)B.clone();
            A.add(C);
            B.clear();
            int row=3;
            while (row<numRows){
                B.add(1);
                for (int i=0;i<row-1;i++){
                        int temp=C.get(i)+C.get(i+1);
                        B.add(temp);
                }
                B.add(1);
                C=(ArrayList<Integer>)B.clone();
                A.add(C);
                B.clear();
                row++;
            }


            return A;
        }

        return A;
        }


    public static void main(String[] args){
//        int[] b;
//        b=leetcode88.merge(5);
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        a=leetcode118.generate(0);
        System.out.println(a);
    }
    }

