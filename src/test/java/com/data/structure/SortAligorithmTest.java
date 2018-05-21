package com.data.structure;

import org.junit.Test;

/**
 * Created by Administrator on 2018/4/16.
 */
public class SortAligorithmTest {

    @Test
    public void bubbleSortTest(){
        int array[] = new int[]{3,5,10,7,1,8};
        SortAligorithm.bubbleSort(array);
    }

    @Test
    public void bubbleSortTest2(){
        int array[] = new int[]{3,5,10,7,1,8};
        SortAligorithm.bubbleSort2(array);
    }

    @Test
    public void selectorSortTest(){
        int array[] = new int[]{3,5,10,7,1,8};
        SortAligorithm.selectorSort(array);
    }

    @Test
    public void insertSortTest(){
        int array[] = new int[]{3,5,10,7,1,8};
        SortAligorithm.insertSort(array);
    }
}
