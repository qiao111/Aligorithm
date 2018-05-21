package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class PriorityQueueTest  {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(10);
        priorityQueue.insert(7);
        priorityQueue.insert(12);
        priorityQueue.insert(8);
        priorityQueue.insert(5);

        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue.isFull());
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
