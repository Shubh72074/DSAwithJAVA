package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class AddToVal {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>();
        numbs.add(-1);
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(1);

        int target = 2;

        int count = 0;

        for (int i = 0; i < numbs.size(); i++) {
            for ( int j = i + 1; j < numbs.size(); j++) {
                if (numbs.get(i) + numbs.get(j) < target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
