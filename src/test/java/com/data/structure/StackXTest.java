package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class StackXTest {

    public static void main(String[] args) {
        StackX stackX = new StackX(4);
        stackX.push(10);
        stackX.push(20);
        stackX.push(30);
        stackX.push(40);

        while(!stackX.isEmpty()){
            System.out.println(stackX.pop());
        }
    }
}
