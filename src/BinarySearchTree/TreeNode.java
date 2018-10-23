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
