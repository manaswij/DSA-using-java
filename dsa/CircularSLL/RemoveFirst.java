import java.util.NoSuchElementException;

public class RemoveFirst {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }
    public RemoveFirst(){
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
        ListNode fourth = new ListNode(14);

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
    public ListNode removefirst(){
    if(isEmpty()){
        throw new NoSuchElementException("Circular SLL is already empty");
    }
    ListNode temp = last.next;
        if(last.next == last){
            last = null;
        } else {
            last.next = temp.next;
    }
        temp.next = null;
        length--;
        return temp;
   }

   // Returning deleted data 

   public int removeFirstAndReturnData(){
    if(isEmpty()){
        throw new NoSuchElementException("CLL is empty");
    }
    ListNode temp = last.next;
    int result = temp.data;
    if(last.next == last){
        last = null;
    }
    else{
        last.next = temp.next;
    }
    //temp.next = null;
    length--;

    return result;
}


   public static void main(String[] args) {
    RemoveFirst obj = new RemoveFirst();
    
    obj.createCircularSLL();
  
    obj.insertFirst(4);
    obj.insertFirst(11);

    obj.insertLast(10);
    
    obj.display();

    obj.removefirst();
    obj.display();

    System.out.println(obj.removeFirstAndReturnData() +" Removed");
        obj.display();
        System.out.println(obj.removeFirstAndReturnData() +" Removed");
        obj.display();
}
}
