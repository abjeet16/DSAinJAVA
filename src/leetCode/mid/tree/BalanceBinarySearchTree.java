package leetCode.mid.tree;

import java.util.ArrayList;
import java.util.List;

/// 1382. Balance a Binary Search Tree
public class BalanceBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /*public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        conList(list,root);
        return conBBST(list,0,list.size()-1);
    }

    private TreeNode conBBST(List<Integer> list, int i, int j) {
        if (i>j)
            return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.right = conBBST(list,mid+1,j);
        root.left = conBBST(list,i,mid-1);
        return root;
    }

    private void conList(List<Integer> list, TreeNode root) {
        if (root==null){
            return;
        }
        conList(list,root.left);
        list.add(root.val);
        conList(list,root.right);
    }*/
    ArrayList<TreeNode> res = new ArrayList<TreeNode>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return Build_BST(0, res.size() - 1);
    }

    public void inorder(TreeNode root ){
        if(root == null) return;
        inorder(root.left);
        res.add(root);
        inorder(root.right);
    }

    public TreeNode Build_BST( int start, int end){
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = res.get(mid);
        node.left = Build_BST( start, mid - 1);
        node.right = Build_BST( mid + 1, end);
        return node;
    }
}
