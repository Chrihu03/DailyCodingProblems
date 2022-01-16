package com.company.problem465;

import helpers.SLL;


/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Given the head of a singly linked list, reverse it in-place.
 */
public class reverseSLL {
    public static void reverseList(SLL list){
        reverse(list.getHead(), list);
    }

    public static void main(String[] args) {
        SLL<Integer> list = new SLL<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list: " + list.listValues());
        System.out.println("--1--");
        reverseList(list);
        System.out.println("--2--");
        System.out.println("reversed list: " + list.listValues());
    }

    private static SLL.SLL_Node reverse(SLL.SLL_Node node, SLL list) {
        if (node.getNextNode() != null) {
            SLL.SLL_Node parentNode = reverse(node.getNextNode(), list);
            parentNode.setNextNode(node);
        }
        else{
            System.out.println("Setting head");
            list.setHead(node);
        }
        System.out.println("list: " + list.listValues());
        return node;
    }
}
