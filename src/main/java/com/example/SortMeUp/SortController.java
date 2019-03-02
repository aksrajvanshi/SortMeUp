package com.example.SortMeUp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@ComponentScan
@Controller
public class SortController {

    @RequestMapping(value = "/")
    public String init(){

        return "sortPage";
    }


    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public String sortNumbers(@RequestParam("id") String id, @RequestParam("array") String arr){

        System.out.println(" i am in the sort numbers function! " + id + " with array values " + arr );

        return "sortPage";
    }

}
