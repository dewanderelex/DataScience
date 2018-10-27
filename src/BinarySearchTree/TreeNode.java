package BinarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert (int data){
        if (this.data == data){
            return;
        }
        if (data < this.data){
            if (left == null){
                left = new TreeNode(data);
            }else {
                left.insert(data);
            }
        }else{
            if (right == null){
                right = new TreeNode(data);
            }else {
                right.insert(data);
            }
        }
    }

    public TreeNode get (int data){
        if (this.data == data){
            return this;
        }
        if (data > this.data){
            right.get(data);
        }
        if (data < this.data){
            left.get(data);
        }
        return null;
    }

    public int getHeight() {
        if (this == null) return -1;
        return 1 + Math.max(left.getHeight(), right.getHeight());
    }

    public void traversePostOrder() {
        if (left != null){
            left.traversePostOrder();;
        }
        if (right != null){
            right.traversePostOrder();;
        }
        System.out.print(root.data + " ");
    }

    public static TreeNode push(Node root,int data) {
        
        // Base case
        if (root == null){
            root = new Node (data);
            return root;
        }
        
        // Recursive
        if (data < root.data){
            root.left = insert(root.left, data);
        }else if (data > root.data){
            root.right = insert(root.right, data);
        }
    	
        return root;
    }

    public int min (){
        if (left == null){
            return data;
        }else {
            return left.min();
        }
    }

    public int max (){
        if (right == null){
            return data;
        }else {
            return right.max();
        }
    }

    public void traverseInOrder (){
        if (left != null){
            left.traverseInOrder();
        }
        System.out.print(data + " ");
        if (right != null){
            right.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
