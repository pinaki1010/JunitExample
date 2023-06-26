package com.pinaki.junit.Testcase;

import static org.junit.jupiter.api.Assertions.*;

import com.pinaki.junit.Math.MathEx;
import org.junit.jupiter.api.Test;

class MathTest {

    private MathEx mathEx = new MathEx();

    @Test
    void test() {

        assertEquals(6,mathEx.calculateSum(new int[] {1,2,3,}));


    }

}
