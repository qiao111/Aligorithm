package com.data.structure;

import java.util.Arrays;

/**
 * 排序算法
 * Created by Administrator on 2018/4/16.
 */
public class SortAligorithm {

    /**
     * 冒泡排序算法: 从0开始比较相邻的两数字的大小，左边大于右边则交换数字，继续从下一个位置比较相邻的大小，
     * 这样会把最大的值放在最后面，接下来就是比较0到最大值-1
     */
    public static void bubbleSort(int[] array){
        System.out.println("冒泡排序最左侧=======");
        for(int i =array.length-1;i>1;i--){
            System.out.println("第" + (array.length -i) + "次排序" );
            for(int j = 0; j<i;j++){
                if(array[j]>array[j+1] ){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }

    }

    /**
     * 冒泡排序算法： 从0开始 每次比较0和后面的数值，如果0位上的数值大于后面的数值则进行交换,一直到最后，这样第一次循环后0位上的是最小值，
     * 接下来从1开始比较，会选出第二个小值
     * @param array
     */
    public static void bubbleSort2(int[] array){
        System.out.println("冒泡排序最右侧=======");
        for(int i = 0; i<array.length-1;i++){
            System.out.println("第" + (i+1) + "次排序" );
            for(int j= i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }

    /**
     * 选择排序算法：从0开始选出最小的值 然后拿最小的值和0号位置交换，接下来从1开始和剩余元素的最小的位置交换
     * @param array
     */
    public static void selectorSort(int[] array){
        System.out.println("选择排序算法======");
        for(int i = 0;i<array.length-1 ;i++){
            int minIndex = i;
            for(int j = i+1;j<array.length ;j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * 插入排序算法：第1个位置作为标记，把第二个位置的数据插入到第一个位置的有序队列中，
     *  第二次的时候前两个位置就是有序的，把第三个元素插入到前面的有序队列中
     *  7 3 4 5 2 1
     *  3 7 4 5 2 1
     *  3 4 7 5 2 1
     *
     * @param array
     */
    public static  void insertSort(int array[]){
        System.out.println("插入排序算法======");
        for(int i = 1; i<array.length;i++){
            int temp = array[i];
            int j = i;
            while(j > 0 && array[j-1] > temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
