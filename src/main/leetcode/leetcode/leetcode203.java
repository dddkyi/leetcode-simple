package main.leetcode.leetcode;

public class leetcode203 {

    public static leetcode.ListNode removeElements(leetcode.ListNode head, int val) {
        leetcode.ListNode node;
        node=head;
        if (head==null){return null;}
        while (head.val==val){
            if(head.next==null){
                return null;
            }
            head=head.next;
        }
        while (node!=null&&node.next!=null) {
            if (node.next.val == val) {
                if (node.next.next==null){
                    node.next=null;
                }
                else {node.next = node.next.next;continue;}
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args){
        leetcode.ListNode b;
        leetcode.ListNode listNode=new leetcode.ListNode(1);
        listNode.next=new leetcode.ListNode(2);
        listNode.next.next=new leetcode.ListNode(6);
        listNode.next.next.next=new leetcode.ListNode(3);
//        listNode.next.next.next.next=new leetcode.ListNode(4);
//        listNode.next.next.next.next.next=new leetcode.ListNode(5);
//        listNode.next.next.next.next.next.next=new leetcode.ListNode(6);
        b=leetcode203.removeElements(listNode,6);
        System.out.println(b);
    }
}
