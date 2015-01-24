package com.kava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class u {
    public static <T> List<T> listOf(T... sources) {
        ArrayList<T> list = new ArrayList<T>();
        Collections.addAll(list, sources);
        return list;
    }
}
