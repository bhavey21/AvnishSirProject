package com.example;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.DbTable;
import com.example.repo.DbTableRepo;
import com.example.service.DbTableService;

@SpringBootTest
class AvnishSirProjectApplicationTests {

	@Autowired
	DbTableService dbTableService;
	
	@MockBean
	DbTableRepo dbTableRepo;
	
	@Test
	public void insertTest() {
		DbTable data= new DbTable(1,"abc","def");
		when(dbTableRepo.save(data)).thenReturn(data);
		assertEquals(data, dbTableService.insertToDb(data));
	}
	
	@Test
	public void getAllTest() {		
		when(dbTableRepo.findAll()).thenReturn(Stream.of(new DbTable(1,"abc","def"), new DbTable(1,"ghi","jkl")).collect(Collectors.toList()));
		assertEquals(2,dbTableService.getAll().size());
	}

}
