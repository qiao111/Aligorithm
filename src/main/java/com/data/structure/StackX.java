package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class StackX {

    private int top;

    private int size;

    private int[] stackArray;

    public StackX(int size){
        stackArray = new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            stackArray[++top] = element;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull(){
        return top == size -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
