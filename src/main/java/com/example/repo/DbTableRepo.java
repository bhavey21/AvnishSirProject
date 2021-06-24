package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DbTable;


public interface DbTableRepo extends JpaRepository<DbTable,Long> {

}
