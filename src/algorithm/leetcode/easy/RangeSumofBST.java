package algorithm.leetcode.easy;

public class RangeSumofBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        return btsSum(root,low,high);
    }

    public int btsSum(TreeNode root, int low ,int high){
        int result = 0;
        if(root == null){
            return result;
        }

        if(root.val >= low && root.val <=high){
            result += root.val;
        }

        result += btsSum(root.left,low,high);
        result += btsSum(root.right,low,high);

        return result;
    }
}
