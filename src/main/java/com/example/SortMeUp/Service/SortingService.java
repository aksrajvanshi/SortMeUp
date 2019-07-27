package com.example.SortMeUp.Service;

import com.example.SortMeUp.Model.SorterModel;

public interface SortingService {

    int[] sortNumbers(String sortingAlgo, int[] inputIntegerArray, SorterModel sorterModel);
}
