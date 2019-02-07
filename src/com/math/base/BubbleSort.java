package com.math.base;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 6, 63, 1, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        bubbleSort.listArr(arr);
    }

    private void listArr(int[] arr) {
        int flag = 0;
        while (flag < arr.length) {
            System.out.print(arr[flag] + " ");
            flag++;
        }
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
