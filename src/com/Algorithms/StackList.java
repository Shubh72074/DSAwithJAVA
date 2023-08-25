package com.Algorithms;

import java.util.Vector;

public class StackList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] nums = {1,2,3,4,5,6};
        for (int num: nums) {
            System.out.println(stack.push(num));
        }
        System.out.println("Printing All elements:");
        stack.printItems();
        stack.popItem();
    }
}
class Stack {
    Vector<Integer> arr = new Vector<>();
    protected String push(int data) {
        arr.add(data);
        return "ADDED ITEM";
    }

    protected void printItems() {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }

    protected void popItem() {
        System.out.println("POPPED: "+arr.remove(0));
    }

}
