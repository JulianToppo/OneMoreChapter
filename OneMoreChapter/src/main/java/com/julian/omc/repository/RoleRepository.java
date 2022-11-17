package com.julian.omc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julian.omc.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
