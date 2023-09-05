package com.Problems;


import java.util.*;

public class DeepCopyLL {
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.random = null;
        head.next.random=head;
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;
        Node ans = DeepCopy(head);
        while(ans != null){
            System.out.println(ans.val);
            if(ans.random != null) {
                System.out.println("Random VAl: "+ans.random.val);
            }
            ans = ans.next;
        }
    }
    static Node DeepCopy(Node head) {
        List<Node> nodes = new ArrayList<>();
        Node ans = new Node(0);
        Node ans2 = ans;
        while(head != null) {
            nodes.add(head);
            ans.next = new Node(head.val);
            ans = ans.next;
            head = head.next;
        }
        Node f_ans = ans.next;
        Node temp = ans2.next;
        Node temp2 = ans2.next;
        int pos = 0;
        while(temp != null) {
            if(nodes.get(pos).random != null) {
                for(int i=1; i<nodes.indexOf(nodes.get(pos).random); i++) {
                    temp2 = temp2.next;
                }
                temp.random = temp2;
            }
            pos++;
            temp = temp.next;
        }
        return f_ans;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
