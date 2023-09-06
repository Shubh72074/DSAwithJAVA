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
       List<Node> arr1 = new ArrayList<>();
       List<Node> arr2 = new ArrayList<>();
       Node ans = new Node(0);
       Node temp_h = head;
       Node temp_ans = ans;

       while(temp_h != null) {
           arr1.add(temp_h);
           temp_ans.next = new Node(temp_h.val);
           arr2.add(temp_ans.next);
           temp_h = temp_h.next;
           temp_ans = temp_ans.next;
       }
       temp_ans = ans.next;
       for(Node node: arr1) {
           temp_ans.random = node.random == null ? null : arr2.get(arr1.indexOf(node.random));
           temp_ans = temp_ans.next;
       }
       return ans.next;
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
