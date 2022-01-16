package com.company.problem476;

/*
This problem was asked by Google.

You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}. By the pigeonhole principle,
there must be a duplicate. Find it in linear time and space.
 */

public class FindDuplicate {
    public static Integer findDuplicate(Integer[] array){
        Integer result = null;
        Boolean[] list = new Boolean[array.length];
        for (int i = 0; i < array.length; i++){
            if (list[array[i]-1] == null){
                list[array[i]-1] = Boolean.TRUE;
            }
            else{
                result = array[i];
                break;
            }
        }
        return result;
    }
}
