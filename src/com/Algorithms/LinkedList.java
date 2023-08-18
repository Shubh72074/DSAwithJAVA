package com.Algorithms;

import java.util.Scanner;

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
        System.out.println("ENTER '0' TO EXIT");
        int input = 1;
        while (input != 0) {
            System.out.print("ENTER VAL: ");
            Scanner val = new Scanner(System.in);

        }
    }
}

class Node {
    int val;
    Node next;
    Node(){}
}
