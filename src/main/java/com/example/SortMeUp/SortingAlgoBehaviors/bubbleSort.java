package com.example.SortMeUp.SortingAlgoBehaviors;

import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;

public class bubbleSort implements SortingBehavior {
    @Override
    public int[] sort(int[] arrayToBeSorted) {

        if (arrayToBeSorted.length == 0) {
            return arrayToBeSorted;
        }

        for (int i = 0; i < arrayToBeSorted.length - 1; i++) {

            for (int j = 0; j < arrayToBeSorted.length - 1 - i; j++) {

                if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {

                    int temp = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = temp;

                }

            }
        }


        return arrayToBeSorted;
    }
}
