package Learnings;
import java.util.*;

public class BinaryTrees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1)return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //Preorder Traversal
    public static void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Inorder Traversal
    public static void inOrder(Node root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Postorder Traversal
    public static void postOrder(Node root){
        if(root == null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Level Order Traversal
    public static void levelOrder(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //Count Nodes
    public static int countNodes(Node root){
        if(root == null)return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    //Sum of Nodes
    public static int sumOfNodes(Node root){
        if(root == null)return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    //Height of Tree
    public static int height(Node root){
        if(root == null)return 0;
        int leftST = height(root.left);
        int rightSt = height(root.right);

        return 1 + Math.max(leftST,rightSt);
    }

    //Diameter of the Tree O(n^2)
    public static int diameter(Node root){
        if(root == null)return 0;

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    //Diameter O(n)
    public static TreeInfo diameter2(Node root){

        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

        return myInfo;
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        //preOrder(root);
        //System.out.println();
        //inOrder(root);
        //System.out.println();
        //postOrder(root);
        //System.out.println();
        //levelOrder(root);
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println("Height of Tree: "+height(root));
        System.out.println("Diameter: "+diameter2(root).diam);
    }
}
