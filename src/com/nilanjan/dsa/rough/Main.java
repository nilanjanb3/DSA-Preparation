package com.nilanjan.dsa.rough;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);

        SortedSet<Integer> res;

        res = s.tailSet(200);

        System.out.println(res.toString());

    }
}
