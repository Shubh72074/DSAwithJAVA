package com.Problems;

public class RemoveChar {
    public static void main(String[] args) {
        removeCharFromString("abcbcdjfkd", 'c');
        removeCharFromString("ABCC", 'C');
        removeCharFromString("shubha", 'a');

    }

    private static void removeCharFromString(String input, char c) {
        String result = input.replaceAll(String.valueOf(c), "");
        System.out.println(result);
    }
}
