package com.kava;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class uTest {
    @Test
    public void testListOf() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(u.listOf(1, 2, 3), list);
    }
}