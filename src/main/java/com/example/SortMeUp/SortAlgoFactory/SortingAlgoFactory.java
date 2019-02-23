package com.example.SortMeUp.SortAlgoFactory;

import com.example.SortMeUp.SortingAlgoBehaviors.bubbleSort;
import com.example.SortMeUp.SortingAlgoBehaviors.mergeSort;
import com.example.SortMeUp.SortingAlgoBehaviors.quickSort;
import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;

public class SortingAlgoFactory {

    public SortingBehavior returnSortingAlgorithm(String id){

        if(id.equals("bubsort")){
            return new bubbleSort();
        }
        else if(id.equals("mersort")){
            return new mergeSort();
        }
        else if(id.equals("quisort")){
            return new quickSort();
        }

        return null;
    }

}
