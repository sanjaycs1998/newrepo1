package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Director;

@Repository

public interface directorRepository extends CrudRepository<Director,Integer> {

}
