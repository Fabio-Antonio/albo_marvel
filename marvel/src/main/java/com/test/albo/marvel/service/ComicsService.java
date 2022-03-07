package com.test.albo.marvel.service;

import java.util.List;

import com.test.albo.marvel.model.Comics.Comics;

public interface ComicsService {

    List<?> findAll();

    List <Comics> updateMany(List <Comics> comics );

    List<Comics> findByName(String name);

    Comics save(Comics comic);

    Comics update(Comics comic );

    void delete(String id);
    
}
