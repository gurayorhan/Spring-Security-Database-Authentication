package com.example.springsecurity.repository;

import com.example.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {

    Users findByUsername(String a);
}
