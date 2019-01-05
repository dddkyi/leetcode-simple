package leetcode;
// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
//  }
//运行超时
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//       ListNode p=l1;
//       ListNode q=l2;
//       int sum1=0;
//       int sum2=0;
//        while (p != null){
//            int i=10;
//            sum1=sum1+p.val*i;
//            p=p.next;
//            i*=10;
//        }
//        while (q!=null){
//            int j=10;
//            sum2=sum2+q.val*j;
//            q=q.next;
//            j*=10;
//        }
//
//        int sum=sum1+sum2;
//
//        ListNode l3=new ListNode(0);
//        while (sum/10!=0){
//
//            l3.next=new ListNode(sum%10);
//            l3=l3.next;
//        }
//
//        return l3;
//    }
//}
class leetcode2 {
//官方答案

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);//设置头节点对象
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;//将变量赋值为0
        while (p != null || q != null) {//如果l1和l2节点不为空的话就执行循环
            int x = (p != null) ? p.val : 0;//l1不为空就将值赋值给x
            int y = (q != null) ? q.val : 0;//同上
            int sum = carry + x + y;//直接相加，直接进位
            carry = sum / 10;//对sum取整赋给carry
            curr.next = new ListNode(sum % 10);//建立新链表
            curr = curr.next;//新链表指针右移
            if (p != null) p = p.next;//p不等于空的话右移
            if (q != null) q = q.next;//同上
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);//如果l1长度与l2长度不等，令新节点等于长的那部分
        }
        return dummyHead.next;//返回第一个节点
    }
}