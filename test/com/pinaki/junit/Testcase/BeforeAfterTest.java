package com.pinaki.junit.Testcase;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    //BeforeEach
    //@BeforeEach
    @BeforeAll
    static void Test1(){
        System.out.println("Before-All");
    }

    @Test
    void Test2(){
        System.out.println("Test-2");
    }

    @Test
    void Test4(){
        System.out.println("Test-4");
    }

    //AfterTest
    //@AfterEach
    @AfterAll
    static void Test5(){
        System.out.println("After All");
    }

    @Test
    void Test3(){
        System.out.println("Test-3");
    }

}
