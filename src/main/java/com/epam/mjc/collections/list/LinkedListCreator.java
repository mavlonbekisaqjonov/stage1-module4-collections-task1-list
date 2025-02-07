package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> output = new LinkedList<>();
        for(int i:sourceList) {
            if(i%2==0) {
                output.addLast(i);
            } else {
                output.addFirst(i);
            }
        }
        return (LinkedList<Integer>) output;
    }
}
