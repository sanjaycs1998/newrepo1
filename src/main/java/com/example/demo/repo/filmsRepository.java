package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Films;

@Repository
public interface filmsRepository extends CrudRepository<Films,Integer> {

}
