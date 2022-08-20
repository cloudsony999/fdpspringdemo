package com.bankingsystem.dao;

import com.bankingsystem.entity.Account;

public interface AccountDao {

	Account createAccount(Account account);

//	void readAccount(int accno);
//
//	void updateAccount(int acno, Account a);
//
//	void deleteAccount(int accno);

}

/*
 * 
 * 1. add a method to apply fixed deposit for the bank a. account must exist b.
 * for min 5 years must throw exception c. must return amount after 5 yrs with
 * interest rate 7.1% d. parameter must have only account no e. initial deposit
 * must be > 50000 must throw exception
 * 
 * 
 * --------------------------
 * 
 * 
 * 1. add a method for Higher study from the bank 2. MTECH 5 lac 3. loan using a
 * method 4. btech .....> 75% bank will take less interest (4%) 5.
 * btech----->60% bank will take less interest (7%) 6. eligible for loan
 * ????(boolean) 7. if true then go for the loan
 * 
 * 
 */