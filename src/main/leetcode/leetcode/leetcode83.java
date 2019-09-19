package main.leetcode.leetcode;

public class leetcode83 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public  static leetcode.ListNode deleteDuplicates(leetcode.ListNode head) {
             int temp;
             leetcode.ListNode l=head;
             if (head==null) {
                 return null;
             }
             if (head.next==null) {
                 return head;
             }
             while (l.next!=null){
                 temp=l.val;
                 if(l.next.val==temp){
                     l.next=l.next.next;
                 }else {
                     l=l.next;
                 }
             }
        return head;
        }

    public static void main(String[] args){
        leetcode.ListNode b;
        leetcode.ListNode listNode=new leetcode.ListNode(1);
        listNode.next=new leetcode.ListNode(1);
        listNode.next.next=new leetcode.ListNode(2);
        b=leetcode83.deleteDuplicates(listNode);
        System.out.println(b);
    }
}
