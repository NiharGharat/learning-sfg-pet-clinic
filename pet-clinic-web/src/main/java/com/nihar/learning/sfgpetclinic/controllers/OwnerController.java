package com.nihar.learning.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/owner")
@Controller
public class OwnerController {

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public String indexCtrl(Model model) {
        return "owner/index";
    }
}
