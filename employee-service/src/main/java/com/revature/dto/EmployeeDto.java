package com.revature.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class EmployeeDto {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
}
