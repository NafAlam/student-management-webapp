package com.nafalam.sma.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nafalam.sma.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}