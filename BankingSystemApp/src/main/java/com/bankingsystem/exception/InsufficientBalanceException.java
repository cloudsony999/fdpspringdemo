package com.bankingsystem.exception;

//this exception will check balance 
public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message)
	{
		
		super(message);
	}
}
