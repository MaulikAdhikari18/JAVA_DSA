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
    Node root;

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
}
