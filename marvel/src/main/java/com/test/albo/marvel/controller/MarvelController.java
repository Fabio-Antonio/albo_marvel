package com.test.albo.marvel.controller;


import com.test.albo.marvel.model.Comics.Comics;
import com.test.albo.marvel.service.ComicsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marvel")
public class MarvelController {


    @Autowired
    
    private ComicsService comicsService;


    @GetMapping("/characters/{name}")
    public ResponseEntity<?> findCharactersByName(@PathVariable String name) {
        List<Comics> comics = comicsService.findByName(name);
        return ResponseEntity.ok().body(comics);
    }

    @GetMapping("/colaborators/{name}")
    public ResponseEntity<?> findByColaboratorsName(@PathVariable String name) {
        List<Comics> comics = comicsService.findByName(name);
        return ResponseEntity.ok().body(comics);
    }

}