package com.company.problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*

Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

 */

public class FindSum {
    /*

     */
    static public boolean twoLoopSolution(List<Integer> list,Integer target){
        if (list == null || list.size() < 2) {
            return false;
        }
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    static public boolean singleLoopSolution(List<Integer> list,Integer target){
        if (list == null){
            return false;
        }
        HashMap<Integer,Boolean> seenNumbers = new HashMap<>();
       for (int i = 0; i < list.size(); i ++){
            int curVal = list.get(i);
            int diffToTarget = target - curVal;
            if (seenNumbers.containsKey(diffToTarget)){
                return true;
            }
            else {
                seenNumbers.put(curVal,true);
            }
        }
        return false;
    }
}
