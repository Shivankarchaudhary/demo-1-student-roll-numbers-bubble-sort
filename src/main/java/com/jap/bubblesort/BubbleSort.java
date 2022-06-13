package com.jap.bubblesort;


public class BubbleSort
{
    public static void main(String[] args) {
    int[] rollNos = {102,100,101,103,109,110,111,132,105,108};
    BubbleSort bubbleSort = new BubbleSort();
    int[] sortedArray = bubbleSort.bubbleSort(rollNos);
    System.out.println("\n" + "The Sorted Roll Numbers of the Students are : ");
    bubbleSort.printArray(sortedArray);

}
int[] bubbleSort(int[] arr) {

        int temp = 0;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }


    void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
