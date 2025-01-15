package com.pedro;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {

    // store keys of cache (new -> old)
    static Deque<Integer> dq;

    // store references of key in cache
    private static HashSet<Integer> map;

    //maximum capacity of cache
    static int csize;

    LRUCache(int n)
    {
        dq=new LinkedList<>();
        map=new HashSet<>();
        csize=n;
    }

    void refer(int x)
    {
        // not present in cache
        if (!map.contains(x)) {
            // cache is full
            if (dq.size() == csize) {
                // delete least recently used element
                dq.removeLast();
                map.remove(x);
            }
        }
        // present in cache
        else {
            // move x to recently used
            dq.remove(x);
        }
        // update reference
        dq.addFirst(x);
        map.add(x);
    }

    // display contents of cache
    private void display()
    {
        for (Integer integer : dq) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

}
