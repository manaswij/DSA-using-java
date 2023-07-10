public class LoopDetect {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display() {   
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
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }

    public void createLoopInSLL(){

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
   
    public static void main(String[] args) {
        LoopDetect obj = new LoopDetect();
        
        obj.createLoopInSLL();

        System.out.println("Loop Detected: " + obj.containsLoop());

    }
}
