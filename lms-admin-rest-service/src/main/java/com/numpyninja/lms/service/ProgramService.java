package com.numpyninja.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numpyninja.lms.entity.Program;
import com.numpyninja.lms.jpa.repository.ProgramRepository;

@Service
public class ProgramService {

	@Autowired
	ProgramRepository repository;

	public List<Program> findAll() {
		return repository.findAll();
	}

	public Program createProgram(Program newProgram) {
		return repository.save(newProgram);
	}

	public Optional<Program> findProgram(Long id) {

		return repository.findById(id);
	}

	public Program updateProgram(Program newProgram) {

		return repository.save(newProgram);
	}

	public void deleteProgram(Long id) {
		repository.deleteById(id);
	}

}
