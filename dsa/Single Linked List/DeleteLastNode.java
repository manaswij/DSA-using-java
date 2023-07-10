public class DeleteLastNode {
    
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        
        ListNode current = head;

        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void insertEnd(int value){

        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }

    public ListNode deleteFirst(){
        if(head ==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head==null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next=null;
        return current;
    }

    public static void main(String[] args) {
        DeleteLastNode obj = new DeleteLastNode();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        
        obj.insertEnd(10);
        obj.insertEnd(11);
        obj.insertEnd(12);


        obj.display();
        System.out.println(" "); 
        System.out.println(obj.deleteLast().data);      
        System.out.println(obj.deleteLast().data);      

        obj.display();
    }
    
    
}
