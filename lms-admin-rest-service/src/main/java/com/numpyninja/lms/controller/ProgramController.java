package com.numpyninja.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numpyninja.lms.entity.Program;
import com.numpyninja.lms.service.ProgramService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class ProgramController {

	@Autowired
	ProgramService programService;

	@GetMapping("/programs")
	List<Program> all() {
		return programService.findAll();
	}

	@PostMapping("/programs")
	Program createProgram(@RequestBody Program newProgram) {
		return programService.createProgram(newProgram);
	}

	// Single item

	@GetMapping("/programs/{id}")
	Optional<Program> findProgram(@PathVariable Long id) {

		return programService.findProgram(id);
	}

	@PutMapping("/programs/{id}")
	Program updateProgram(@RequestBody Program newProgram, @PathVariable Long id) {
		
		System.out.println("newProgram:" +  newProgram.toString());

		return programService.updateProgram(newProgram);
	}

	@DeleteMapping("/programs/{id}")
	void deleteProgram(@PathVariable Long id) {
		programService.deleteProgram(id);
	}

}
