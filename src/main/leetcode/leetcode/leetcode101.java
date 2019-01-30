package main.leetcode.leetcode;
import main.leetcode.*;
//参考自chenzhuopeng
public class leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        return isSame(root,root);

    }
    public boolean isSame(TreeNode p,TreeNode q) {


        if (p==null&&q==null){
            return true;
        }
        if (p!=null&&q!=null&&p.val==q.val){
            return isSame(p.left,q.right)&&isSame(p.right,q.left);
        }else {
            return false;
        }
    }
}
