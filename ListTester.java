public class ListTester {
 
        public static void main(String[] args) {
            SinglyLinkedList sll = new SinglyLinkedList();
            sll.add(3);
            System.out.println(sll.printValues());
            sll.add(4);
            sll.add(10);
            System.out.println(sll.printValues());
            sll.add(5);
            sll.add(15);
            sll.add(2);
            System.out.println(sll.printValues());
            sll.remove(2);
            sll.remove(3);
            System.out.println(sll.printValues());
        }
    
}
