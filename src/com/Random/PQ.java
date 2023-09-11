package com.Random;

import java.util.PriorityQueue;
import java.util.Stack;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        q.add("first");
        q.add("second");
        q.add("third");

        System.out.println(q.poll());

        Stack s = new Stack();

        s.push("ss");
        s.push("sasa");
        s.push("wqqw");

        System.out.println(s.pop());
    }
}
