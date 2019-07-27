package com.example.SortMeUp.Service;

import com.example.SortMeUp.Model.SorterModel;

public interface ModelCreatorService {

    SorterModel createModelObjectFromInput(String id, String arr);
}
