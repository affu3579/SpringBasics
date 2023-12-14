package com.JPAproject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAproject.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
