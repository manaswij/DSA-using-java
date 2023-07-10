public class InsertNodePosition {
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
    
        public void insert(int position, int value){

            ListNode newNode = new ListNode(value);
            
            //Insert at start of SLL
            if (position == 1){
                newNode.next = head;
                head = newNode;
            }
            else{
                ListNode previous = head;
                int count = 1;
                while(count < position -1){
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = newNode;
                newNode.next = current;
            }
        }

        public static void main(String[] args) {
            InsertNodePosition obj = new InsertNodePosition();
            obj.insert(1,100);
            obj.insert(2, 99);

            obj.display();
        }
}
