package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class ImplementingStack {
    public static void main(String[] args) {
        MyStack Stack = new MyStack();

        Stack.push(3);
        Stack.push(7);

        System.out.println(Stack.pop());
        System.out.println(Stack.top());
        System.out.println(Stack.empty());
    }
}

class MyStack {
    List<Integer> stack;
    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
