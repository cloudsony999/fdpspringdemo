package com.bankingsystem.exception;

//this exception will check account existence 
public class AccountExistException extends Exception{

	public AccountExistException(String message)
	{
		super(message);
	}
}
