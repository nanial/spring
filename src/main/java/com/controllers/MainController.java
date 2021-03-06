package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@org.springframework.stereotype.Controller
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping
    public String greeting(@RequestParam(value="name", defaultValue="World") String name,
                             Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

}
