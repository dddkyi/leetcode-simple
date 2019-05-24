package main.leetcode.leetcode;

import leetcode.ListNode;

public class leetcode160 {

    public static leetcode.ListNode getIntersectionNode(leetcode.ListNode headA, leetcode.ListNode headB) {

        leetcode.ListNode a=headA;
        ListNode b=headB;

        ListNode temp=null;
        if (a==null){
            return a;
        }
        while (b!=null){
            if (a==null&&temp==null){
                a=headA;
                b = b.next;
            }
            if (a==null&&temp!=null){
                a=headA;
            }
            if (a.val!=b.val&&b!=null) {
                temp=null;
                a = a.next;
                continue;

            }
            else if (a.val==b.val){
                if(temp==null){
                    temp=a;
                }
                a=a.next;
                b=b.next;
            }

    }
        return temp;
    }

    public static void main(String[] args){



        ListNode headA=null;

        ListNode headB=new ListNode(2);

        ListNode b=leetcode160.getIntersectionNode(headA,headB);
        System.out.println(b);
    }
}
