package com.company.problem1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FindSumTest {

    @Test
    public void findTarget_withNullList(){
        assertFalse(FindSum.twoLoopSolution(null,20));
        assertFalse(FindSum.singleLoopSolution(null,20));
    }

    @Test
    public void findTarget_withListOfOne(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        assertFalse(FindSum.twoLoopSolution(list,20));
        assertFalse(FindSum.singleLoopSolution(list,20));
    }

    @Test
    public void findTarget_listContainsTarget(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);
        assertTrue(FindSum.twoLoopSolution(list,17));
        assertTrue(FindSum.singleLoopSolution(list,17));
    }

    @Test
    public void findTarget_listDoesNotContainTarget(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(8);
        assertFalse(FindSum.twoLoopSolution(list,17));
        assertFalse(FindSum.singleLoopSolution(list,17));
    }

    @Test
    public void findTarget_twoItemListContainsTarget(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        assertTrue(FindSum.twoLoopSolution(list,17));
        assertTrue(FindSum.singleLoopSolution(list,17));
    }

    @Test
    public void findTarget_twoItemListDoesNotContainTarget(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        assertFalse(FindSum.twoLoopSolution(list,17));
        assertFalse(FindSum.singleLoopSolution(list,17));
    }

}