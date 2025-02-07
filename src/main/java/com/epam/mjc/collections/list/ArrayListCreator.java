package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        List<String> output = new ArrayList<>();
        int count = 1;
        for(String str : sourceList) {
            if(count%3==0 && count !=1 ) {
                output.add(str);
                output.add(str);
            }
            count++;
        }
        return (ArrayList<String>) output;
    }
}
