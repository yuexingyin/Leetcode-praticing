import java.util.*;

/**
 * Typical BFS problem
 */

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=0; i<level; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                tmp.add(queue.poll().val);
            }
            res.add(tmp);
        }
        return res;
    }
}
