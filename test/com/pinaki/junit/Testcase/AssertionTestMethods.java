package com.pinaki.junit.Testcase;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTestMethods {
    List<String> todo = Arrays.asList("Pinaki","Nandan","Hota");

    @Test
    void test() {

       boolean test = todo.contains("Pinaki");

        boolean testFalse = todo.contains("Pinakidfd");


      // assertEquals(true,test);
        assertTrue(test);
        //assertFalse
        assertFalse(testFalse);
        //AssertArrayEquals
        assertArrayEquals(new int[]{1,2},new int[] {1,2});




    }
}
