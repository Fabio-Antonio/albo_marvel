package com.test.albo.marvel.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import com.test.albo.marvel.service.ComicsService;
import com.test.albo.marvel.service.SyncService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.albo.marvel.model.Comics.Comics;
import com.test.albo.marvel.model.Comics.ComicsData;
import com.test.albo.marvel.utils.SyncUtil;



@Service
public class  SyncServiceImpl implements SyncService {


	private final RestTemplate restTemplate;

	@Autowired 
    private ComicsService comicsService;
	
	

	private String url  = "http://gateway.marvel.com/v1/public/";
	
	@Value("${marvelApiPublicKey}")
	public String publicKey;
	@Value("${marvelApiPrivateKey}")
	public String privateKey;

	public SyncServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


	@Cacheable(value = "comics")
	@Override
	public List<Comics> getComics() {
	
		List<Comics> comics = new ArrayList<>();

        ComicsData apiResponse = restTemplate.getForObject(url+"comics?" + "&ts=" + 1000+ "&apikey="+ publicKey+ "&hash="+ "5177e62fea31fa4d8cde4615eb634e46", ComicsData.class);
       /* if (apiResponse != null && apiResponse.getCode().equals("200")) {
           
        }*/
		comics = Arrays.asList(apiResponse.getData().getResults());
		comicsService.updateMany(comics);
        return comics;
	}


}
