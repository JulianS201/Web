package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {

    @GetMapping("/pagina2")
    public String getPagina2() {
        return "pagina2";
    }

    @GetMapping("/pagina3")
    public String getPagina3() {
        return "pagina3";
    }
}