package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class QueueXTest {

    public static void main(String[] args) {
        QueueX queueX = new QueueX(5);
        queueX.insert(10);
        queueX.insert(20);
        queueX.insert(30);
        queueX.insert(40);
        queueX.insert(50);
        while(!queueX.isEmpty()){
            System.out.println(queueX.remove());
        }
    }
}
