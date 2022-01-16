package com.company.problem476;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicateTest {

    @Test
    public void testOne(){
        Integer[] testArray1 = {1,5,3,4,5,2};
        Integer[] testArray2 = {1,1,3,4,5,2};
        Integer[] testArray3 = {1,6,3,4,5,2,8,7,10,9,10};
        Integer result = FindDuplicate.findDuplicate(testArray1);
        assertEquals((int)result,5);
        result = FindDuplicate.findDuplicate(testArray2);
        assertEquals((int)result,1);
        result = FindDuplicate.findDuplicate(testArray3);
        assertEquals((int)result,10);
    }
}