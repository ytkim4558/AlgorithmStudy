package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Q2_3_DELETE_MIDDLE_NODE;

import CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Node;
import java.util.*;

public class Question {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        System.out.println("삭제전");
        n1.printLoopNodeDataToEnd();
        deleteMiddleNode(n2);
        System.out.println("삭제후");
        n1.printLoopNodeDataToEnd();
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
