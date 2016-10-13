import java.util.*;

/**
 * Created by YuexingYin on 10/12/16.
 */
public class BinaryTreeZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean reverse = false;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(reverse){
                Collections.reverse(tmp);
                reverse = false;
            }else{
                reverse = true;
            }
            res.add(tmp);
        }
        return  res;
    }
}
