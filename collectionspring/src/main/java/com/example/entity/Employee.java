package com.example.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	private int empno;
	private String ename;

	private List<String> knownLanguages;
	private Set<String> skills;
	private Map<String, String> salaryDetails;

}
