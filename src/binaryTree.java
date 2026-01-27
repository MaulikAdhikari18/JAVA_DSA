import java.util.*;


public class binaryTree {
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
}
