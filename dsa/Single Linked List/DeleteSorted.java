public class DeleteSorted {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display() 
    {
        
        ListNode current = head;

        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
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
    public void delete (int key){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }

        if (current == null){
            return;
        }

        temp.next = current.next;
    }

    public static void main(String[] args) {
        DeleteSorted obj = new DeleteSorted();
        obj.insertFirst(5);
        obj.insertFirst(4);
        obj.insertFirst(4);
        obj.insertFirst(3);
        obj.insertFirst(2);
        obj.insertFirst(1);

        obj.display();
        obj.delete(4);
        obj.display();
        
    }
}
