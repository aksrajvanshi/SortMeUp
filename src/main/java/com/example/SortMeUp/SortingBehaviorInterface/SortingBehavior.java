package com.example.SortMeUp.SortingBehaviorInterface;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface SortingBehavior {

    public int[] sort(int [] arrayToBeSorted);
}
