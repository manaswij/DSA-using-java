public class Insertnodestart {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
        count++;
        }
        return count++;
    }

    public void display(){
        
        ListNode current = head;

        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println(" ");

        
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }
//length??
    
    

    public static void main(String[] args)
    {
        Insertnodestart obj = new Insertnodestart();
        
        obj.insertFirst(1);
        obj.insertFirst(4);
        obj.insertFirst(7);
        // obj.length();
    
        obj.display();

        

    };


}
