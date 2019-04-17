package main.leetcode.leetcode;

public class leetcode141 {
//    方法一：快慢指针法
    public static boolean hasCycle(leetcode.ListNode head) {

        leetcode.ListNode fast=head;
        leetcode.ListNode slow=head;

        while(fast!=null&&fast.next!=null){
            if (fast.next.next==slow.next){
                return true;
            }else {
                fast=fast.next.next;
                slow=slow.next;
            }
        }

        return false;

    }

//hashmap
//    public static boolean hasCycle(leetcode.ListNode head) {
//
//
//
//    }


    public static void main(String[] args){
        boolean a;
//        leetcode.ListNode b=new ListNode(1);
        leetcode.ListNode b=null;
//        b.next=new ListNode(2);
//        b.next.next=new ListNode(0);
//        b.next.next.next=new ListNode(-4);
        a= leetcode141.hasCycle(b);
        System.out.println(a);
    }
}
//https://blog.csdn.net/sinat_35261315/article/details/79205157