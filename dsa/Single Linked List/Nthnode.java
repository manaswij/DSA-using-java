public class Nthnode {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head){
        
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

    public ListNode getNthNodefromEnd(int n){
        if(head == null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value: n = "+n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0; 

        while (count<n){
            if(refPtr == null){
                throw new IllegalArgumentException(n +"is greater than no. of nodes int the list");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        Nthnode obj = new Nthnode();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        
        obj.insertEnd(10);
        obj.insertEnd(11);
        obj.insertEnd(12);

        obj.display(head);
        
       System.out.println("3rd Node from End: " + obj.getNthNodefromEnd(3).data);
       //returns only int therefore sys.out.print 
}
}
