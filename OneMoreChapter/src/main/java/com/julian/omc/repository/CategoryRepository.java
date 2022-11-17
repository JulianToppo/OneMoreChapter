package com.julian.omc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julian.omc.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
