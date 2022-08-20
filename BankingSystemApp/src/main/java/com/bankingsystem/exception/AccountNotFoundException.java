package com.bankingsystem.exception;

//this exception will check account number found or not
public class AccountNotFoundException extends Exception {

	public AccountNotFoundException(String message)
	{
		super(message);
	}
}
