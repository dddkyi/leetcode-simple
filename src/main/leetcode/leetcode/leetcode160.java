package main.leetcode.leetcode;

import leetcode.ListNode;

public class leetcode160 {

    public static leetcode.ListNode getIntersectionNode(leetcode.ListNode headA, leetcode.ListNode headB) {

        leetcode.ListNode a=headA;
        ListNode b=headB;
//        Queue temp=null;
//        while (b!=null){
//            if (a!=b&&b!=null){
//                if (a.next!=null) {
//                    a=a.next;
//                }
//                b=b.next;
//            }else if (a==b){
//                return a;
//            }
////        }
        ListNode temp=null;
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
//                if (a.next != null) {
                a = a.next;
                continue;
//                }else if (a.next==null){
//                    a=headA;
//                }
//                b = b.next;
            }
            else if (a.val==b.val){
//                if (temp0!=null&&temp0!=temp.next){
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


        ListNode headA=new ListNode(4);
        headA.next=new ListNode(1);
        headA.next.next=new ListNode(8);
        headA.next.next.next=new ListNode(4);
        headA.next.next.next.next=new ListNode(5);

        ListNode headB=new ListNode(5);
        headB.next=new ListNode(0);
        headB.next.next=new ListNode(1);
        headB.next.next.next=new ListNode(8);
        headB.next.next.next.next=new ListNode(4);
        headB.next.next.next.next.next=new ListNode(5);
        ListNode b=leetcode160.getIntersectionNode(headA,headB);
        System.out.println(b);
    }
}
