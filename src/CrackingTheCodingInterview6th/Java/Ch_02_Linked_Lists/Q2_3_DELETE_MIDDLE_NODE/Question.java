package CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Q2_3_DELETE_MIDDLE_NODE;

import CrackingTheCodingInterview6th.Java.Ch_02_Linked_Lists.Node;
import java.util.*;

public class Question {
    public static void main(String[] args) {




    }
    boolean deleteMiddleNode(Node n) {
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
