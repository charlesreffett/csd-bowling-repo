package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pin-count", "2");
        return "index";
    }

    @PostMapping(path = "/pin-manager", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getPins(@RequestBody PinManager pm) {
        return new ResponseEntity<>(pm, HttpStatus.OK);
    }
}