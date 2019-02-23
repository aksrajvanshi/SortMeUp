package com.example.SortMeUp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
public class SortController {

    @RequestMapping(value = "/")
    public String sortNumbers(){

        return "sortPage";
    }

}
