package com.demo.Dao.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.Dao.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
