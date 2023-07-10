import java.util.Stack;


public class RecursivePostOrder {
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

        public void PostOrder(TreeNode root){
            if(root == null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + "");                       
        }

    
        public static void main(String[] args) {
            RecursivePostOrder obj = new RecursivePostOrder();
            obj.createBinaryTree();;
            obj.PostOrder(obj.root);

        }

}







