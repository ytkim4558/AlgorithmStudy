package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Q2_3_DELETE_MIDDLE_NODE;

import CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Node;
import java.util.*;

public class Question {
    public static void main(String[] args) {
//        Node head = new Node("head");
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
//        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("삭제전");
//        head.printLoopNodeDataToEnd();
        a.printLoopNodeDataToEnd();
        deleteMiddleNode(c);
        System.out.println("삭제후");
//        head.printLoopNodeDataToEnd();
        a.printLoopNodeDataToEnd();
    }
    static boolean deleteMiddleNode(Node n) {
        if(n == null) return  false;
        if(n.next == null) {
            n = null;
            return true;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
}
