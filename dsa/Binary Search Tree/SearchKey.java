public class SearchKey {
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
    
    public TreeNode search(int key){
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }

        if(key<root.data){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args){
        SearchKey obj = new SearchKey();

        obj.insert(5);
        obj.insert(3);
        obj.insert(7);
        obj.insert(1);

        obj.inOrder(obj.root);
        System.out.println(" ");

        if(null != obj.search(3)){
            System.out.println("Key found !!!");
        }else{
            System.out.println("Key not found");
        }
    }
}
