package leetcode141_150.binaryTreePostorderTraversal;

import java.util.List;

public class Solution {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new java.util.ArrayList<>();
        if (root == null) return res;

        // left -> right -> root
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(postorderTraversal(root));
    }
}
