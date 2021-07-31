package com.cg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
