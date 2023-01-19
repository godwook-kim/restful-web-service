package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // database 관련
public interface UserRepository extends JpaRepository<User,Integer> {
}
