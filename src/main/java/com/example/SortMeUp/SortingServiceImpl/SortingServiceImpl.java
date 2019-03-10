package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Service.SortingService;
import com.example.SortMeUp.SortAlgoFactory.SortingAlgoFactory;
import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
@SpringBootApplication(scanBasePackages={"com.example.SortMeUp.SortAlgoFactory", "com.example.SortMeUp.SortingBehaviorInterface"})
public class SortingServiceImpl implements SortingService {

    @Autowired
    SortingAlgoFactory sortingAlgoFactoryService;

    SortingBehavior sortingBehavior;

    @Override
    public String sortNumbers(String sortingAlgo, int[] unsortedIntegerArray) {

        sortingBehavior = sortingAlgoFactoryService.returnSortingAlgorithm(sortingAlgo);

        for(int i=0; i < unsortedIntegerArray.length; i++){
            System.out.print(unsortedIntegerArray[i] + " ");
        }

        int [] sortedArray = performSort(sortingBehavior, unsortedIntegerArray);
        System.out.println(" Sorted array -> ");
        for(int i=0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }

        return Arrays.toString(sortedArray);
    }

    public int [] performSort(SortingBehavior sortingBehavior, int [] array){

        return sortingBehavior.sort(array);

    }

}
