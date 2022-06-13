package com.jap.bubblesort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest
{
    BubbleSort bubbleSort;
    int[] rollNos;
    @Before
    public void setUp(){
        bubbleSort = new BubbleSort();
        rollNos = new int[]{102,100,101,103,109,110,111,132,105,108};
    }

    @After
    public void tearDown(){
        bubbleSort = null;
        rollNos  = null;
    }

    @Test
    public void givenAnArrayReturnInSortedOrder(){
        assertArrayEquals(new int[]{100,101,102,103,105,108,109,110,111,132},bubbleSort.bubbleSort(rollNos));
        assertArrayEquals(new int[]{100,101,102,103,105,108,109,110,111,132},bubbleSort.bubbleSort(new int[]{100,101,102,103,105,108,109,110,111,132}));
    }
}
