public class BST{

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; 

        public TreeNode (int data){
            this.data=data;
        }
    }
    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left=insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void InOrder(TreeNode root){ //doubt
        InOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(5);
        obj.insert(3);
        obj.insert(7);
        obj.insert(1);

        obj.inOrder(obj.root);
    }

}