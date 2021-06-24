package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.DbTable;
import com.example.repo.DbTableRepo;

@Service
public class DbTableService {

	@Autowired
	DbTableRepo dbTableRepo;
	
	public DbTable insertToDb(DbTable model){
		return dbTableRepo.save(model);
	}
	
	public List<Map<String,String>> getAll() {
		
		List<DbTable> dbList=dbTableRepo.findAll();
		
		List<Map<String,String>> mapList= new ArrayList<Map<String, String>>();
		
		for (DbTable i : dbList) {
			  Map<String,String> m = new HashMap<String,String>();
			  m.put(i.getKey_id(), i.getValue());
			  mapList.add(m);
        }
		return mapList;
	}
	
}
