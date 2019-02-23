package com.example.SortMeUp.SortingAlgoBehaviors;

import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;

public class quickSort implements SortingBehavior {

    @Override
    public int[] sort(int[] arrayToBeSorted) {
        return quickSortAlgorithm(arrayToBeSorted, 0 , arrayToBeSorted.length);
    }

    public int[] quickSortAlgorithm(int []arr, int start, int end){

        if(start >= end){
            return null;
        }

        int pivot = partition(arr, start, end);
        quickSortAlgorithm(arr, start, pivot-1);
        quickSortAlgorithm(arr, pivot+1, end);

        return arr;

    }


    public int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;

        for(int i = start; i <= end-1; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        int temp = pivot;
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;

        return pIndex;
    }

}
