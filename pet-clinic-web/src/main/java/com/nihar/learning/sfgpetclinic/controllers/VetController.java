package com.nihar.learning.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping(value = {"/vet", "/vet/index", "/vet/index.html"})
    public String indexCtrl(Model model) {
        return "vet/index";
    }
}
