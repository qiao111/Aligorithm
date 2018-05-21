package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 * 优先级队列则是在插入的时候对数据进行了排序
 */
public class PriorityQueue {

    private int front;

    private int rear;

    private int size;

    private int[] datas;

    public PriorityQueue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        datas = new int[size];
    }

    public void insert(int element){
        if(rear == -1){
            datas[++rear] = element;
        }else{
            insertSort(element);
        }
    }

    /**
     * 插入排序
     * @param element
     */
    private void insertSort(int element){
        int j = ++rear;
        while(j>0 && datas[j-1] >element){
            datas[j] = datas[j-1];
            j--;
        }
        datas[j] = element;

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
