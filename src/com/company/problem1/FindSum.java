package com.company.problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSum {
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
