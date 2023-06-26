package com.pinaki.junit.Math;

public class MathEx {

    public int calculateSum(int []numbers) {

        int sum=0;

        for(int number:numbers) {
            sum += number;
        }
        return sum;
    }

}
