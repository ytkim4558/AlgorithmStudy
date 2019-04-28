package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists;

public class Node {
    public Node next = null;
    public int data;
    public Node(int d) {
        data = d;
    }

    void appendTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
