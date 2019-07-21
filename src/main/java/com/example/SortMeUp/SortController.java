package com.example.SortMeUp;
import com.example.SortMeUp.Model.SorterModel;
import com.example.SortMeUp.Service.ModelCreatorService;
import com.example.SortMeUp.Service.ProcessStringService;
import com.example.SortMeUp.Service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ComponentScan
@Controller
public class SortController {

    @Autowired
    private SortingService sortingService;

    @Autowired
    private ProcessStringService processStringService;

    @Autowired
    private ModelCreatorService modelCreatorService;

    @RequestMapping(value = "/")
    public String init(){

        return "sortPage";
    }


    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public SorterModel sortNumbers(@RequestParam("id") String id, @RequestParam("array") String arr){

        SorterModel sorterModel = modelCreatorService.createModelObjectFromInput(id, arr);

        processStringService.convertToIntArray(sorterModel, sorterModel.getInputStringArrayFromPage());

        if(sorterModel.getInputArray()!=null){
            sortingService.sortNumbers(id, sorterModel.getInputArray(), sorterModel);
        }

        return sorterModel;
    }

}
