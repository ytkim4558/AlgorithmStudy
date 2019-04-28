package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists;

public class Node {
    public Node next = null;
    public Object data;
    public Node(Object d) {
        data = d;
    }

    public Node appendTail(Object d) {
        Node tail = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = tail;
        return tail;
    }

    public void printLoopNodeDataToEnd() {
        Node n = this;
        while(n != null) {
            System.out.print(n.data);
            if(n.next != null) System.out.print(" -> ");
            n = n.next;
        }
        System.out.println("");
    }
}
