import java.util.Stack;


public class RecursivePreOrder {
  private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; 

        public TreeNode (int data){
            this.data=data;
        }
    }

        public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first; //root--> first
        first.left = second;
        first.right = third; //second<-- first --> third
        second.left = fourth;
        }

        public void preOrder(TreeNode root){
            if(root == null){
                return;
            }
            System.out.print(root.data + "");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void main(String[] args) {
            RecursivePreOrder obj = new RecursivePreOrder();
            obj.createBinaryTree();;
            obj.preOrder(obj.root);

        }

}





