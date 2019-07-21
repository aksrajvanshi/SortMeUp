package com.example.SortMeUp.SortingServiceImpl;

import com.example.SortMeUp.Model.SorterModel;
import com.example.SortMeUp.Service.ModelCreatorService;
import org.springframework.stereotype.Service;

@Service
public class ModelCreatorServiceImpl implements ModelCreatorService {

    SorterModel sorterModel;

    @Override
    public SorterModel createModelObjectFromInput(String id, String arr) {

        sorterModel = new SorterModel();
        sorterModel.setSortingAlgorithm(id);
        sorterModel.setInputStringArrayFromPage(arr);

        return sorterModel;
    }
}
