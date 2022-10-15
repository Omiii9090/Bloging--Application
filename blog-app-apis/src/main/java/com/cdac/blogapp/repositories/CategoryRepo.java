package com.cdac.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.blogapp.entities.Category;
// interface category extends jpa repostry
//and data type handle is categoory and id is integer
//interface so we not use any anantotion 

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
