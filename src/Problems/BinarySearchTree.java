package Problems;

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

    //Convert to Increasing order Search Tree
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

    //Kth smallest element in BST
    public int kthSmallest(BSTNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(list,root);
        return list.get(k-1);
    }

    //Valid BST
    long prev = Long.MIN_VALUE;

    public boolean isValidBST(BSTNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (root.val <= prev) return false;
        prev = root.val;

        return isValidBST(root.right);
    }

    //108.Convert Sorted Array to BST
    public BSTNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public BSTNode build(int[] nums,int left,int right){
        if(left > right)return null;
        int mid = left + (right - left)/2;
        BSTNode root = new BSTNode(nums[mid]);
        root.left = build(nums,left,mid-1);
        root.right = build(nums,mid+1,right);
        return root;
    }
}


public class BinarySearchTree {

    
}
