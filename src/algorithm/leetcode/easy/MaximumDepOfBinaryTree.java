package algorithm.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDept = 0;
        if(root  == null){
            return maxDept;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);


        while(!queue.isEmpty()){
            maxDept++;
            int dept = queue.size();

            for(int i = 0 ; i< maxDept; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }

        }

        return maxDept;
    }
}
 
