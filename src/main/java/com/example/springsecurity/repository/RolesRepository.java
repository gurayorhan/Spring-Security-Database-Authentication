package com.example.springsecurity.repository;

import com.example.springsecurity.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {

}
