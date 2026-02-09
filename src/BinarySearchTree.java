import java.util.*;

class BSTNode{
    int val;
    BSTNode left;
    BSTNode right;

    BSTNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    //Search in BST
    public BSTNode searchBST(BSTNode root, int val) {
        if(root == null)return null;
        if(root.val == val)return root;
        if(root.val > val)return searchBST(root.left,val);
        return searchBST(root.right,val);
    }

    //Increasing order Search Tree
    public BSTNode increasingBST(BSTNode root) {

    List<Integer> list = new ArrayList<>();
    inOrder(list, root);

    BSTNode newRoot = null;
    BSTNode curr = null;

    for (int val : list) {
        BSTNode node = new BSTNode(val);
        if (newRoot == null) {
            newRoot = node;
            curr = node;
        } else {
            curr.right = node;
            curr = node;
        }
    }

    return newRoot;
}

private void inOrder(List<Integer> list, BSTNode root) {
    if (root == null) return;
    inOrder(list, root.left);
    list.add(root.val);
    inOrder(list, root.right);
}
}


public class BinarySearchTree {

    
}
