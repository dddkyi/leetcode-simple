package leetcode;

public class leetcode83 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public  static ListNode deleteDuplicates(ListNode head) {
             int temp;
             ListNode l=head;
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
        ListNode b;
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(1);
        listNode.next.next=new ListNode(2);
        b=leetcode83.deleteDuplicates(listNode);
        System.out.println(b);
    }
}
