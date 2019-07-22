package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Model.SorterModel;
import com.example.SortMeUp.Service.ProcessStringService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProcessStringImpl implements ProcessStringService {

    @Override
    public void convertToIntArray(SorterModel sorterModel, String inputString) {

        ArrayList<Integer> returnArrayList = new ArrayList<>();

        String [] inputNumbersSplitted = inputString.split(",");

        for(int i=0; i < inputNumbersSplitted.length; i++){

            try {
                if (!inputNumbersSplitted[i].equals("")) {

                    returnArrayList.add(Integer.parseInt(inputNumbersSplitted[i]));
                }
            }catch (NumberFormatException e1){
                sorterModel.setExceptionType(e1);
                e1.printStackTrace();
                sorterModel.setErrorMessage(" The given input is not in proper format. Please review the input and try again");
                return;
            }
            catch(IllegalArgumentException e2){
                sorterModel.setExceptionType(e2);
                e2.printStackTrace();
                sorterModel.setErrorMessage(" Wrong argument provided. ");
                return;
            }

        }
        int [] inputArray = new int[returnArrayList.size()];
        for(int i=0; i < returnArrayList.size(); i++){
            inputArray[i] = returnArrayList.get(i);
        }

        sorterModel.setInputArray(inputArray);
    }
}
