package com.jbjohn.agg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Display controller
 */
@Controller
@SuppressWarnings("unused")
public class DisplayController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/ace")
    String ace() {
        return "ace";
    }
}
