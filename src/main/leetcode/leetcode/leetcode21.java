package main.leetcode.leetcode;

class leetcode21 {

    public leetcode.ListNode mergeTwoLists(leetcode.ListNode l1, leetcode.ListNode l2) {

        leetcode.ListNode headnode=new leetcode.ListNode(0);
        leetcode.ListNode p=l1,q=l2,curr=headnode;
        while (p!=null&&q!=null) {
            if (p.val <= q.val) {
                curr.next = new leetcode.ListNode(p.val);
                curr = curr.next;
                p = p.next;
            } else if (p.val > q.val) {
                curr.next = new leetcode.ListNode(q.val);
                curr = curr.next;
                q = q.next;
            }
        }
        if (p!=null){
            curr.next=p;
        }else if (q!=null){
            curr.next=q;
        }
        return headnode.next;


    }

}
