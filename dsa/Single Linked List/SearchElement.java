public class SearchElement {
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

    public boolean searchElement(ListNode head, int searchKey){

        if(head == null){
            return false;
        }

        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }

        return false;
    }

   
    public static void main(String[] args) {
        SearchElement obj = new SearchElement();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        
        obj.insertEnd(10);
        obj.insertEnd(11);
        obj.insertEnd(12);

        
        obj.display();
        
        if(obj.searchElement(head,  3)){
            System.out.println("Search Key Found!");
        }
        else{
            System.out.println("Search Key Not Found!");
        }

    }
}
