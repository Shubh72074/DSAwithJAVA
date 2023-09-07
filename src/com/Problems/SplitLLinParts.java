package com.Problems;

public class SplitLLinParts {
    public static void main(String[] args) {
        Node h = new Node(12);
        h.next = new Node(122);
        h.next.next = new Node(1);

        Node[] ans = new Node[5];
        int size = 0;
        while(h != null) {
            size++;
            h = h.next;
        }
        if (size%5 == 0) {
            int gap = size/5;
            Node[] temp = new Node[gap];
            for(int i=0; i<gap; i++) {

            }
        }
    }
}
