package com.Random;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        list.add(1);
        System.out.println(list);
        System.out.println(list.contains(1));
    }
}
