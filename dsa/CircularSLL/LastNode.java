public class LastNode {
        private ListNode last;
        private int length;
    
        private class ListNode{
            private ListNode next;
            private int data;
    
            public ListNode(int data){
                this.data = data;
            }
        }
        public LastNode(){
            last = null;
            length = 0;
        }
    
        public int length(){
            return length;
        }
    
        public boolean isEmpty(){
            return length == 0;
        }
    
        public void display(){
            if(last==null){
                return;
            }
            ListNode first = last.next;
            while(first != last){
                System.out.print(first.data + " ");
                first = first.next;
            }
            System.out.println(first.data);
        }
    
        public void createCircularSLL(){
            ListNode first = new ListNode(1);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(3);
            ListNode fourth = new ListNode(4);
    
            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = first;
    
            last = fourth;
        }
    
        public void insertFirst(int data){
            ListNode temp = new ListNode(data);
            if(last==null){
                last = temp;
            } else {
                temp.next = last.next;
            }
            last.next = temp;
            length++;
        }

        public void insertLast(int data){
            ListNode temp = new ListNode(data);
            if(last==null){
                last = temp;
            } else{
                temp.next = last.next;
                last.next = temp;
                last = temp;
            }
            length++;
        }
      
        public static void main(String[] args) {
            LastNode obj = new LastNode();
            
            obj.createCircularSLL();
            obj.insertFirst(14);
            obj.insertLast(10);
            
    
            obj.display();
        }
    
    
}
