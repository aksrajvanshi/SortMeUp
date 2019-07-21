package com.example.SortMeUp.Model;

import javax.validation.constraints.NotNull;

public class SorterModel {

    @NotNull
    private String inputStringArrayFromPage;

    @NotNull
    private int[] inputArray;
    @NotNull
    private int[] sortedArray;

    private double sortingTime;
    @NotNull
    private String sortingAlgorithm;

    private String errorMessage;

    private Exception exceptionType;


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

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Exception getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Exception exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getInputStringArrayFromPage() {
        return inputStringArrayFromPage;
    }

    public void setInputStringArrayFromPage(String inputStringArrayFromPage) {
        this.inputStringArrayFromPage = inputStringArrayFromPage;
    }
}
