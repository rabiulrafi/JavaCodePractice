package com.TechRafi.DataStructures;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<String>();
        stack.push("Rafo");
        stack.push("Quio");
        stack.push("Maze");
        stack.push("rotn");
        stack.push("Milto");
        //delete a element from the end
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
