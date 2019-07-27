package com.example.SortMeUp.SortingBehaviorInterface;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface SortingBehavior {

    int[] sort(int[] arrayToBeSorted);
}
