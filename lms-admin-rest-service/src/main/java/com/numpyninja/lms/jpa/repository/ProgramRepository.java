package com.numpyninja.lms.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numpyninja.lms.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
	
}
