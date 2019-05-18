package com.example.SortMeUp.Model;

public class SorterModel {

    private int[] inputArray;
    private int[] sortedArray;
    private double sortingTime;
    private String sortingAlgorithm;


    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public double getSortingTime() {
        return sortingTime;
    }

    public void setSortingTime(double sortingTime) {
        this.sortingTime = sortingTime;
    }

    public String getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    public void setSortingAlgorithm(String sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }
}
