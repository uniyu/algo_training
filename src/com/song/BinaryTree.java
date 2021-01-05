package com.song;

public class BinaryTree extends TreeNode {

}

class TreeNode{
    TreeNode parent,left,right;
    int val;

    static void insert(TreeNode head, int v) {
        if (head.val==v)return;
        if (head.val < v) {
            if (head.right == null) {
                head.right = new TreeNode(head, v);
            } else {
                insert(head.right, v);
            }
        } else {
            if (head.left == null) {
                head.left = new TreeNode(head, v);
            } else {
                insert(head.left, v);
            }
        }
    }

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(TreeNode parent, int val) {
        this.parent = parent;
        this.val = val;
    }

    public TreeNode() {
    }
}
