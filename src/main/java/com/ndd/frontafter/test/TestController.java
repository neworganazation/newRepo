package com.ndd.frontafter.test;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.www.http.HttpClient;

import java.text.ParseException;

@Controller
public class TestController {

    @RequestMapping(value = "/test01",method = RequestMethod.POST)
    @ResponseBody
    public Test test01(@RequestBody Test test){
        System.out.println("123");
        System.out.println(test);
        return test;
    }

    @RequestMapping("/testtemp")
    public String testtemp(){
        return "testtemp";
    }



}
