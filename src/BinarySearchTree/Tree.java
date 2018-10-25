package BinarySearchTree;

public class Tree {
    private TreeNode root;

    public void insert (int data){
        if (root == null){
            root = new TreeNode(data);
        }else {
            root.insert(data);
        }
    }

    public TreeNode get (int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    public int getHeight() {
        if (root != null){
            return root.getHeight();
        }
        return 0;
    }

    public void traversePostOrder() {
        if (root != null){
            root.traversePostOrder();
        }
    }

    public int min (){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    public int max (){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        return root.max();
    }

    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }

}
