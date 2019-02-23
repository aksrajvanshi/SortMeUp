package com.example.SortMeUp.SortingAlgoBehaviors;

import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;

public class mergeSort implements SortingBehavior {

    @Override
    public int[] sort(int[] arrayToBeSorted) {

        int n = arrayToBeSorted.length;
        if(n<2){
            return null;
        }
        int mid = n/2;
        int []left = new int[mid];
        int []right = new int[n-mid];

        for(int i=0; i< mid; i++){
            left[i] = arrayToBeSorted[i];
        }
        for(int i=mid; i< n; i++){
            right[i-mid] = arrayToBeSorted[i];
        }

        sort(left);
        sort(right);
        int[] sorted = merge(left,right, arrayToBeSorted);

        return sorted;

    }

    public int[] merge(int[]left, int[]right, int[]arr){
        int l1 = left.length;
        int l2 = right.length;

        int i=0, j=0, k=0;

        while(i < l1 && j < l2){

            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else if(left[i] > right[j]){
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<l1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<l2){
            arr[k] = right[j];
            j++;
            k++;
        }

        return arr;

    }
}
