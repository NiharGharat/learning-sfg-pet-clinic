package com.nihar.learning.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    @GetMapping(value = {"/owner", "/owner/index", "/owner/index.html"})
    public String indexCtrl(Model model) {
        return "owner/index";
    }
}
