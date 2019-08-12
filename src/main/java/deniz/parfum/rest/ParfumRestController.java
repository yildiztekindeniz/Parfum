package deniz.parfum.rest;


import deniz.parfum.entity.Parfum;
import deniz.parfum.service.ParfumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParfumRestController {

    private ParfumService parfumService;

    @Autowired
    public ParfumRestController(ParfumService parfumService){
        this.parfumService=parfumService;
    }

    @GetMapping("/parfums")
    public List<Parfum> getParfums(){
        List<Parfum> parfums=parfumService.findAll();
        return parfums;

    }

    @PostMapping("/parfums")
    public void insert(@RequestBody Parfum parfum){
        parfumService.save(parfum);
    }

    @PutMapping("/parfums")
    public void update(@RequestBody Parfum parfum){
        parfumService.save(parfum);
    }

    @GetMapping("/parfums/{parfumName}")
    public Parfum getParfum(@PathVariable("parfumName") String parfumName){
        Parfum parfum = parfumService.findByParfumName(parfumName);

        return parfum;
    }






}
