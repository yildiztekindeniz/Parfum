package deniz.parfum.service;


import deniz.parfum.entity.Parfum;
import deniz.parfum.repository.ParfumRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ParfumServiceImpl implements ParfumService{

    private ParfumRepository parfumRepository;

    public ParfumServiceImpl(ParfumRepository parfumRepository){
        this.parfumRepository=parfumRepository;
    }

    @Override
    public List<Parfum> findAll() {
        List<Parfum> parfums = parfumRepository.findAll();
        return parfums;
    }

    @Override
    public void save(Parfum parfum) {

        parfumRepository.save(parfum);

    }

    @Override
    public Parfum findById(String id) {
        Optional<Parfum> result =parfumRepository.findById(id);
        Parfum parfum =null;
        if(result.isPresent()){
            parfum=result.get();
        }
        else{
            throw new RuntimeException("Parfum id not found in " + id);
        }

        return parfum;

    }
}
