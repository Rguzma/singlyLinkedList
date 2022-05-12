public class SinglyLinkedList {

        public Node head;
        public SinglyLinkedList() {
            head = null;
        }
        // SLL methods go here. As a starter, we will show you how to add a node to the list.
        public void add(int value) {
            Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
                // System.out.println(head);
            } else {
                Node runner = head;
                while(runner.next != null) {
                    runner = runner.next;
                }
                runner.next = newNode;
            }

    
        }  
        
    public String printValues(){
        String output = "";
        Node current = head;
        while (current != null){
            output += current.getValue() + ", ";
            current = current.getNext();
        }
        return output;
    }

    public void remove(int value){
        Node current = head;
        Node searched= null;
        if(current.getValue() == value){
            head=head.getNext();
        }
        else{
            while(current.getValue() != value){
                current = current.getNext();
                if (current == null){
                    throw new IndexOutOfBoundsException("Value does not exist");
                }
            }
            searched=current;
            current =head;
            // System.out.println("this is searched "+searched.getValue());
            while(current.getNext()!=searched){
                current = current.getNext();
            }
            current.setNext(searched.getNext());
            System.out.println("this is where the node was "+current.getValue()+" "+current.getNext());
        }
        

    }
    
}
