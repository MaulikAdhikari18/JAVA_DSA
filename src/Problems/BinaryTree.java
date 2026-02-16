import java.util.*;


public class BinaryTree{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        //Constructor
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    TreeNode root;

    //InOrder Traversal using list
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }

    private void inOrder(TreeNode root,List<Integer> list){

        if(root == null)return;

        inOrder(root.left,list);

        list.add(root.data);

        inOrder(root.right,list);
    }

    //PreOrder Traversal using list
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(list,root);
        return list;
    }

    private void preOrder(List<Integer> list,TreeNode root){
        if(root == null)return;
        list.add(root.data);

        preOrder(list,root.left);
        preOrder(list,root.right);
    }

    //PostOrder Traversal using list
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(list,root);
        return list;
    }

    private void postOrder(List<Integer> list,TreeNode root){
        if(root == null)return;
        postOrder(list,root.left);
        postOrder(list,root.right);

        list.add(root.data);
    }

    //Count Nodes
    public int countNodes(TreeNode root) {
        if(root == null)return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    //Same Tree or Not
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if((p == null && q != null)||(p != null && q == null))return false;
        if(p.data != q.data)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    //Symmetric Tree
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null)return true;
        if(left == null || right == null)return false;
        if(left.data != right.data)return false;
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
