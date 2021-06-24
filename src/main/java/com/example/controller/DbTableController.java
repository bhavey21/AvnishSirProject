package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.DbTable;
import com.example.service.DbTableService;

@RestController
public class DbTableController {
	
	@Autowired
	DbTableService dbTableService;
	
	@PostMapping(value="/insert")
	public DbTable insert(@RequestBody DbTable model) {
		return dbTableService.insertToDb(model);
	}
	
	@GetMapping(value="/getAll")
	public List<Map<String,String>> getAll() {
		return dbTableService.getAll();
	}

}
