package com.alshawi.home.repository;
import java.util.Collection;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.alshawi.home.nodes.Student;

public interface StudentRepository extends GraphRepository<Student>{
    @Query("MATCH (n:Student) WHERE id(n)={0} RETURN n")
    Student getStudentFromId(Integer idd);
	// return student by name
    @Query("MATCH (s:Student) where s.name={0} RETURN s")
    Student getStudentByName(String name);
    // return students by major
    @Query("MATCH (s:Student) where s.major={0} RETURN s")
    Collection <Student> getStudentByMajor(String major);
    
    // return students by university
    @Query("MATCH (s:Student) where s.university={0} RETURN s")
    Collection <Student> getStudentByUniversity(String university);
}
