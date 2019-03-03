package com.example.SortMeUp;
import com.example.SortMeUp.Service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ComponentScan
@Controller
public class SortController {

    @Autowired
    SortingService sortingService;

    @RequestMapping(value = "/")
    public String init(){

        return "sortPage";
    }


    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public String sortNumbers(@RequestParam("id") String id, @RequestParam("array") String arr){

        String returnSortedArray = sortingService.sortNumbers(id, arr);
        System.out.println(" i am in the sort numbers function! " + id + " with array values " + arr );

        return arr;
    }

}
