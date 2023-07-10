import java.util.Stack;


public class RecursiveInorder {
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

        public void InOrder(TreeNode root){
            if(root == null){
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + "");           
            InOrder(root.right);
        }

    
        public static void main(String[] args) {
            RecursiveInorder obj = new RecursiveInorder();
            obj.createBinaryTree();;
            obj.InOrder(obj.root);

        }

}





