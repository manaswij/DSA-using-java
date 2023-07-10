public class RemoveDuplicates {
    private static ListNode head;

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
        System.out.println("");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void removeDup(){
        if(head == null){
            return;
        }
        ListNode current = head;

    while(current!= null && current.next != null)
    if (current.data == current.next.data){
        current.next = current.next.next;
    }
    else{
        current = current.next;
    }
  }

  public static void main(String[] args) {
    RemoveDuplicates obj = new RemoveDuplicates();
    obj.insertFirst(5);
    obj.insertFirst(4);
    obj.insertFirst(4);
    obj.insertFirst(3);
    obj.insertFirst(1);
    obj.insertFirst(1);
    
    obj.display();

    obj.removeDup();
    obj.display();
    
    
}
}

