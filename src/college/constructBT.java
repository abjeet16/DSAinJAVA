package college;

import leetCode.mid.tree.BalanceBinarySearchTree;

import java.util.Scanner;

public class constructBT {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private static void display(TreeNode node){
        String display = "right : "+(node.right==null?"null":node.right.val)+
                " left : "+(node.left==null?"null":node.left.val);
        System.out.println(display);
    }
    private static TreeNode insert(TreeNode root,int val){
        if (root==null){
            return new TreeNode(val);
        }
        display(root);
        System.out.println("where do you wanna go 1)left 2)right");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        if (c==1)
            root.left = insert(root.left,val);
        else
            root.right = insert(root.right,val);
        return root;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TreeNode root = null;

        System.out.println("How many nodes do you want to insert?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value:");
            int value = scan.nextInt();
            root = insert(root, value);
        }

        System.out.println("Tree creation completed.");
    }
}
