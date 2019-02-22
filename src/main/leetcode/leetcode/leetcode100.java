package leetcode;

public class leetcode100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p.val==q.val){
            if (p.left.val==q.left.val){
                if (p.right.val==q.right.val){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        TreeNode p=new TreeNode(1);
         p.left=new TreeNode(2);
        TreeNode q=new TreeNode(1);
        q.right=new TreeNode(2);
        boolean b=leetcode100.isSameTree(p,q);
        System.out.println(b);
    }
}
