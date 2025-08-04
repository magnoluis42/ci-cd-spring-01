package com.def.ma.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("")
public class Controller {
    
    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @GetMapping("/teste")
    public ResponseEntity<String> teste(){
        return new ResponseEntity<>("teste", HttpStatus.OK);
    }
    
}
