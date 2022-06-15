package com.TechRafi.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();

        queue.add("Roit");
        queue.add("Rafi");
        queue.add("Rivel");
        queue.add("Koi");
        queue.add("Lif");

        queue.remove();

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
