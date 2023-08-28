package com.Problems;

public class InvertTheTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 23;
        root.left = new TreeNode(10);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(1);
        System.out.print("BEFORE: ");
        System.out.print(root.val + "->");
        System.out.print(root.left.val + "->");
        System.out.print(root.right.val + "->");
        System.out.print(root.left.left.val + "->");
        System.out.print(root.left.right.val + "->");
        System.out.print(root.right.left.val + "->");
        System.out.println(root.right.right.val);

        System.out.println("AFTER: ");

        TreeNode InvertedRoot = invertTree(root);
        System.out.print(InvertedRoot.val + "->");
        System.out.print(InvertedRoot.left.val + "->");
        System.out.print(InvertedRoot.right.val + "->");
        System.out.print(InvertedRoot.left.left.val + "->");
        System.out.print(InvertedRoot.left.right.val + "->");
        System.out.print(InvertedRoot.right.left.val + "->");
        System.out.println(InvertedRoot.right.right.val);

    }

    static TreeNode invertTree(TreeNode root) {
        if (root.left != null && root.right != null) {
            TreeNode temp;
            temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        else if (root.left != null) {
            invertTree(root.left);
        }
        else if (root.right != null) {
            invertTree(root.right);
        }
        else
        {
            return root;
        }
        return root;
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
