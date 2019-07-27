package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Model.SorterModel;
import com.example.SortMeUp.Service.SortingService;
import com.example.SortMeUp.SortAlgoFactory.SortingAlgoFactory;
import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@SpringBootApplication(scanBasePackages = {"com.example.SortMeUp.SortAlgoFactory", "com.example.SortMeUp.SortingBehaviorInterface"})
public class SortingServiceImpl implements SortingService {

    @Autowired
    SortingAlgoFactory sortingAlgoFactoryService;

    SortingBehavior sortingBehavior;

    @Override
    public int[] sortNumbers(String sortingAlgo, int[] unsortedIntegerArray, SorterModel sorterModel) {

        int[] inputArray = Arrays.copyOf(unsortedIntegerArray, unsortedIntegerArray.length);
        sorterModel.setInputArray(inputArray);

        sortingBehavior = sortingAlgoFactoryService.returnSortingAlgorithm(sortingAlgo);
        long startTime = System.nanoTime();
        int[] sortedArray = performSort(sortingBehavior, unsortedIntegerArray);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        sorterModel.setSortedArray(sortedArray);
        sorterModel.setSortingTime(totalTime / 1000000.0);
        return sortedArray;
    }

    public int[] performSort(SortingBehavior sortingBehavior, int[] array) {

        return sortingBehavior.sort(array);

    }

}
