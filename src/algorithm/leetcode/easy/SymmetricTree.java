package algorithm.leetcode.easy;

public class SymmetricTree {
    boolean isSymmetric =true;
    public boolean isSymmetric(TreeNode root) {
        symmetric(root.left,root.right);
        return isSymmetric;
    }

    public void symmetric(TreeNode left,TreeNode right){
        if(left == null  && right == null){
            return;
        }else if(left == null && right != null){
            isSymmetric = false;
            return;
        }else if(left != null && right == null){
            isSymmetric = false;
            return;
        }

        if(left.val != right.val){
            isSymmetric = false;
            return;
        }
        symmetric(left.right,right.left);
        symmetric(left.left,right.right);

    }
}
