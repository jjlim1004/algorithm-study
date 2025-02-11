package algorithm.leetcode.easy;

public class SameTree {
    boolean tf = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        treeCompare(p,q);
        return tf;
    }

    public void treeCompare(TreeNode p, TreeNode q){
        if((p == null && q != null)){
            tf = false;
            return;
        }else if((p != null && q == null)){
            tf = false;
            return;
        }else if( p == null && q == null){
            return;
        }

        if(p.val != q.val){
            tf = false;
            return;
        }
        treeCompare(p.left,q.left);
        treeCompare(p.right,q.right);
    }
}
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
