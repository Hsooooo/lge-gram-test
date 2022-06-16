package com.lgekor.gram.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {

    @GetMapping("/")
    public String indexView() {
        return "index";
    }
}
