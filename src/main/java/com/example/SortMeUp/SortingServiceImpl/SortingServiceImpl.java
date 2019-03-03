package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Service.SortingService;
import com.example.SortMeUp.SortAlgoFactory.SortingAlgoFactory;
import com.example.SortMeUp.SortingBehaviorInterface.SortingBehavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
@SpringBootApplication(scanBasePackages={"com.example.SortMeUp.SortAlgoFactory", "com.example.SortMeUp.SortingBehaviorInterface"})
public class SortingServiceImpl implements SortingService {

    @Autowired
    SortingAlgoFactory sortingAlgoFactoryService;

    SortingBehavior sortingBehavior;

    @Override
    public String sortNumbers(String sortingAlgo, String array) {

        System.out.println(" Inside service Impl " + sortingAlgo + " and with string array " + array);
        sortingBehavior = sortingAlgoFactoryService.returnSortingAlgorithm(sortingAlgo);

    //    int [] sortedArray = performSort(sortingBehavior, array);
        return array;
    }

    public int [] performSort(SortingBehavior sortingBehavior, int [] array){

        return sortingBehavior.sort(array);

    }

}
