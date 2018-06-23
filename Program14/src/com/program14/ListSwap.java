package com.program14;

import java.util.List;

class ListSwap {

    static <T> void swap(List<T> list, int i, int j){

        T val1 = list.get(i);
        T val2 = list.get(j);
        list.set(j,val1);
        list.set(i,val2);
    }

}
