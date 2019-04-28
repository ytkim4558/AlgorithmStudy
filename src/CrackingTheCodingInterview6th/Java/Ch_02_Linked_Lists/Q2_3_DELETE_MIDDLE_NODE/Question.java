package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Q2_3_DELETE_MIDDLE_NODE;

import CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Node;
import java.util.*;

public class Question {
    public static void main(String[] args) {
        Node head = new Node("head");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        System.out.println("삭제전");
        head.printLoopNodeDataToEnd();
        deleteMiddleNode(n3);
        System.out.println("삭제후");
        head.printLoopNodeDataToEnd();
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
