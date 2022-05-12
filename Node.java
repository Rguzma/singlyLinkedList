public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;

    }

    public int getValue(){
        return this.value;
    }
    public Node getNext(){
        return this.next;
    }

    public void setValue(int v){
        this.value=v;
    }
    public void setNext(Node next){
        this.next=next;
    }
}