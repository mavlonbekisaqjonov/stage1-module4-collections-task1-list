package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        int len = sourceList.size();
        int count;
        do {
            count = 0;
            for (int i = 0; i < len - 1; i++) {
                if (comparator.compare(sourceList.get(i), sourceList.get(i + 1)) > 0) { // Proper comparison
                    String temp = sourceList.get(i + 1);
                    sourceList.set(i + 1, sourceList.get(i));
                    sourceList.set(i, temp);
                    count++;
                }
            }
        } while (count != 0);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aa = 5 * (Integer.parseInt(a) * Integer.parseInt(a)) + 3;
        int bb = 5 * (Integer.parseInt(b) * Integer.parseInt(b)) + 3;

        if (aa != bb) {
            return Integer.compare(aa, bb);
        }

        return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
    }
}
