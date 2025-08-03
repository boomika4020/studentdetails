package com.boomi.studentinfo.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boomi.studentinfo.studentdetail.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
