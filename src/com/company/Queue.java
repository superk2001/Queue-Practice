package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {

    LinkedList<Integer> data;

    public Queue() {
        data = new LinkedList();
    }

    public void enqueue(int val) {
        data.add(val);
    }
    public Integer dequeue() {
        try {
            return data.poll();
        }
        catch(NoSuchElementException e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }
    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> ret = new ArrayList();


        while(data.peek() != null) {
            ret.add(dequeue());
        }
        return ret;
    }
}
