package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Service.ProcessStringService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProcessStringImpl implements ProcessStringService {


    @Override
    public int[] convertToIntArray(String inputString) {

        ArrayList<Integer> returnArrayList = new ArrayList<>();

        String [] inputNumbersSplitted = inputString.split(",");

        for(int i=0; i < inputNumbersSplitted.length; i++){

            if(!inputNumbersSplitted[i].equals("")){
                returnArrayList.add(Integer.parseInt(inputNumbersSplitted[i]));
            }

        }
        int [] inputArray = new int[returnArrayList.size()];
        for(int i=0; i < returnArrayList.size(); i++){
            inputArray[i] = returnArrayList.get(i);
        }

        return inputArray;
    }
}
