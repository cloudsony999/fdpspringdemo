package com.bankingsystem.exception;

//this exception will check minimum balance
public class MinimumBalanceException extends Exception{

	public MinimumBalanceException(String message)
	{
		super(message);
	}
}
