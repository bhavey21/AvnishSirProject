package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MapValues")
public class DbTable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String key_id;
    @Column
    private String value;
	public DbTable() {
		
	}
	public DbTable(long id, String key_id, String value) {
		super();
		this.id = id;
		this.key_id = key_id;
		this.value = value;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey_id() {
		return key_id;
	}
	public void setKey_id(String key_id) {
		this.key_id = key_id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    
	

}
