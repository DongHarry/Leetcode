package leetcode141_150.binaryTreePreorderTraversal;

import java.util.List;

public class Solution {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new java.util.ArrayList<>();

        if (root == null) {
            return res;
        }

        // root -> left -> right
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(preorderTraversal(root));
    }
}
