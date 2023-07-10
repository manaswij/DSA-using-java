public class ValidateBST {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;

        private int data;

        public TreeNode(int data){
            this.data = data;
         }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public boolean isValid(){
        return isValid(root,Long.MIN_VALUE , Long.MAX_VALUE);
    }


    public boolean isValid(TreeNode root, long min, long max){

        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }

        boolean left = isValid(root.left, min, root.data);
        if(left){
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args)
    {
        ValidateBST obj = new ValidateBST();
        obj.insert(5);
        obj.insert(3);
        obj.insert(7);
        obj.insert(1);
        obj.insert(4);
        obj.insert(2);

        obj.inOrder();
        System.out.println("");
        System.out.println("Tree is "+ obj.isValid());
        
        
    };
}
