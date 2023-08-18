package com.Problems;

public class ListNodes {
    int val;
    ListNodes next;
    ListNodes() {}
    ListNodes(int val) {this.val = val;}
    ListNodes(int val, ListNodes next) {this.val = val; this.next = next;}

    public static void main(String[] args) {
        ListNodes shead = new ListNodes();
        ListNodes head = shead;
        int[] arr = {1,1,1,2,3,3,3};
        for (int i = 1; i < 7; i++) {
            head.val = arr[i];
            head.next = new ListNodes();
            head = head.next;
        }
        head.next = null;
        RemoveDuplicateNodes.deleteDuplicates(shead);
        while (shead != null) {
            System.out.println(shead.val);
            shead = shead.next;
        }
    }
}

class RemoveDuplicateNodes {
    static void deleteDuplicates(ListNodes head) {
        if (head == null) return;
        ListNodes temp = head;
        while (temp.next != null) {
            int cur = temp.val;
            int nxt = temp.next.val;
            if (cur == nxt ) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }

    }
}
