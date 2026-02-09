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
}


public class BinarySearchTree {

    
}
