
/**
 * Created by YuexingYin on 10/12/16.
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}

