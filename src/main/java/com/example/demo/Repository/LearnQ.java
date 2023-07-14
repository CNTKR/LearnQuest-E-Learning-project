package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.TrainerStudent;
@Repository
public interface LearnQ extends JpaRepository<TrainerStudent, Integer>{
	
	boolean existsByEmail(String email);
	
	TrainerStudent getByEmail(String email);
	
}
