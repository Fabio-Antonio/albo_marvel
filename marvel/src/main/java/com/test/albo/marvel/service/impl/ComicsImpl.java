package com.test.albo.marvel.service.impl;

import java.util.List;

import com.test.albo.marvel.model.Comics.Comics;
import com.test.albo.marvel.repository.ComicsRepository;
import com.test.albo.marvel.service.ComicsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class ComicsImpl implements ComicsService {
    
    @Autowired
    private ComicsRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Comics> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Comics> findByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("characters.items.name").is(name));
        return mongoTemplate.find(query, Comics.class);
    }

    @Override
    public Comics save(Comics character) {
        return repository.save(character);
    }

    @Override
    public Comics update(Comics character) {
        return repository.save(character);
    }

    @Override
    public List<Comics> updateMany(List<Comics> characters) {
        return repository.saveAll(characters);
    }

    @Override
    public void delete(String id) {
       repository.findById(id).ifPresent(superHero -> repository.delete(superHero));
    }
}
