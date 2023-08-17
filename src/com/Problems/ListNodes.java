package com.Problems;

public class ListNodes {
    int val;
    ListNodes next;
    ListNodes() {};
    ListNodes(int val) {this.val = val;}
    ListNodes(int val, ListNodes next) {this.val = val; this.next = next;}

    public static void main(String[] args) {
        ListNodes shead = new ListNodes();
        ListNodes head = shead;
        for (int i = 1; i < 7; i++) {
            head.val = i;
            head.next = new ListNodes();
            head = head.next;
        }
        head.next = null;
        RemoveDuplicateNodes.deleteDuplicate(shead);
    }
}

class RemoveDuplicateNodes {
    static void deleteDuplicate(ListNodes head) {
        ListNodes temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
