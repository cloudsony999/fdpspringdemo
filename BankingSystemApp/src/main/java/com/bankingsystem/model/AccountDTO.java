package com.bankingsystem.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AccountDTO {

	@NotNull
	private int accno;

	@NotNull
	@Size(min = 2, message = "holdername should have atleast 2 characters")
	private String holderName;

	@NotNull
	@Size(message = "account balance can't be null")
	private long accbalance;

	@Email
	@Size(min = 2, message = "email can't be null")
	private String email;

}
