package com.program14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.program14.ListSwap.swap;

public class Program14 {

    public static void main(String[] args) {

        List<Long> arrayList = new ArrayList<>();
        arrayList.add(1L);
        arrayList.add(2L);
        arrayList.add(3L);
        arrayList.add(4L);
        arrayList.add(5L);

        List<Long> linkedList = new LinkedList<>();
        linkedList.add(1L);
        linkedList.add(2L);
        linkedList.add(3L);
        linkedList.add(4L);
        linkedList.add(5L);

        System.out.println("List before swap:  " +arrayList);
        swap(arrayList, 2, 4);
        System.out.println("List after swap:  " +arrayList);

    }
}
