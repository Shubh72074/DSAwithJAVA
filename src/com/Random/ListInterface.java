package com.Random;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(0);
//        list.add(1);
//        System.out.println(list);
//        System.out.println(list.contains(1));

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.pop());

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());

    }
}
