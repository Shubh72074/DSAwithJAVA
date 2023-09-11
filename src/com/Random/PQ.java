package com.Random;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        q.add("first");
        q.add("second");
        q.add("third");

        System.out.println(q.poll());
    }
}
