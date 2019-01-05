package leetcode;

class leetcode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode headnode=new ListNode(0);
        ListNode p=l1,q=l2,curr=headnode;
        while (p!=null&&q!=null) {
            if (p.val <= q.val) {
                curr.next = new ListNode(p.val);
                curr = curr.next;
                p = p.next;
            } else if (p.val > q.val) {
                curr.next = new ListNode(q.val);
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
