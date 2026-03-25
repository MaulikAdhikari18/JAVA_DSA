package Learnings;

public class BinarySearchTrees {
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

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean searchBST(Node root,int key){
        if(root == null)return false;
        if(key == root.data)return true;
        if(root.data > key){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }
    }

    //Delete
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left == null && root.right == null)return null;
            if(root.left == null)return root.right;
            if(root.right == null)return root.left;

            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int x,int y){
        if(root == null)return;
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }else if(root.data >= y){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0;i < values.length;i++){
            root = insert(root, values[i]);
        }

        //inOrder(root);
        //System.out.println();
        //System.out.println(searchBST(root, 4));
        //delete(root,4);
        //inOrder(root);

        printInRange(root, 4, 10);
    }
}
