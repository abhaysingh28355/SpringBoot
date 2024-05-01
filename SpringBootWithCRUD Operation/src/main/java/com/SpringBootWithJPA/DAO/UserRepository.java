package com.SpringBootWithJPA.DAO;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootWithJPA.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
