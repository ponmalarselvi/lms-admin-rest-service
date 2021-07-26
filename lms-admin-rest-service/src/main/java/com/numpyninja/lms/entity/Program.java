package com.numpyninja.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Program {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long programId;
	@NotBlank(message = "Program Name is mandatory")
	String programName;
	String programDescription;
	boolean isOnline;


}
