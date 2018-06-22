package com.program9;

import com.google.common.base.Splitter;

import java.util.List;

class GuavaCuttingFunction {

    static List<String> GuavaCutter(String s, int length){

        return Splitter.fixedLength(length).splitToList(s);
    }

}
