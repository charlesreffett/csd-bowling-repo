package com.example.demo.controller;

import com.example.demo.PinManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PinManagerController {

    @PostMapping(path = "/pin-manager", consumes = "application/json", produces = "application/json")
    public @ResponseBody ResponseEntity<?> getPins(@RequestBody PinManager pm) {
        if(!pm.pe.isEmpty()){
            return new ResponseEntity<>(pm, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(pm, HttpStatus.OK);
    }
}
