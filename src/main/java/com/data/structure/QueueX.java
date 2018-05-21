package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class QueueX {

    private int front;
    private int rear;
    private int size ;
    private int[] datas;

    public QueueX(int size){
        this.size = size;
        this.front = -1;
        this.rear =  -1;
        datas = new int[size];
    }

    public void insert(int element){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            datas[++rear] = element;
        }
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            return datas[++front];
        }
    }

    public int viewFront(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            return datas[front];
        }
    }

    public int viewRear(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            return datas[rear];
        }
    }

    public boolean isEmpty(){
        return front == rear ;
    }

    public boolean isFull(){
        return rear == size -1 && front == -1;
    }
}
