package com.jervis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MovieController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/movies",method = RequestMethod.GET)
    @ResponseBody
    public  Map<String,Object> movieList(){
        logger.info("movieList()::");

        List<String> list = new ArrayList<String>(){{
            add("abc");
            add("def");
        }};

        Map<String,Object> map = new HashMap<String,Object>(){{
            put("list",list);
        }};
        return map;
    }
}
