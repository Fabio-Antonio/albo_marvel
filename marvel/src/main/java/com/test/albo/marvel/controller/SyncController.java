
package com.test.albo.marvel.controller;

import com.test.albo.marvel.model.Comics.Comics;
import com.test.albo.marvel.service.SyncService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/sync")
public class SyncController {

    @Autowired
    private SyncService syncService;

    

	@GetMapping("/comics")
	public List<Comics> getComics() {
		return syncService.getComics();
	}

}
