package com.SpringBootDemo7.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "users", path = "users")//this will directly communicate with postman to h2 without usercontrollerclass//this is smart and intelligent
public interface UserRepository extends JpaRepository<WebsiteUser, Long> {

	
}