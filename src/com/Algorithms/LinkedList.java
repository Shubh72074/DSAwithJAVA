package com.Algorithms;

public class LinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.val = 1;
        node.next = new Node();
        node.next.val = 2;
        node.next.next = new Node();
        node.next.next.val = 3;

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class Node {
    int val;
    Node next;
    Node(){}
}
