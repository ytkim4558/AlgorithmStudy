package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists;

public class Node {
    public Node next = null;
    public Object data;
    public Node(Object d) {
        data = d;
    }

    void appendTail(Object d) {
        Node tail = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = tail;
    }

    public void printLoopNodeDataToEnd() {
        Node n = this;
        while(n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("Null");
    }
}
