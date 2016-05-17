package com.jbjohn.agg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Display controller
 */
@Controller
public class DisplayController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
