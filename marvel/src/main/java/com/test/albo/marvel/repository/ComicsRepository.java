package com.test.albo.marvel.repository;


import com.test.albo.marvel.model.Comics.Comics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicsRepository extends MongoRepository<Comics, String> {

    @Query(value= "{name : ?0}") 
    Comics getComicByName(String name);

    

}