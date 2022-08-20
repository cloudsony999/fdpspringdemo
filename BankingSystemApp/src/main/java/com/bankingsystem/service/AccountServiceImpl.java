package com.bankingsystem.service;

import org.modelmapper.ModelMapper;

import com.bankingsystem.dao.AccountDao;
import com.bankingsystem.daoimpl.AccountDAOImpl;
import com.bankingsystem.entity.Account;
import com.bankingsystem.model.AccountDTO;

public class AccountServiceImpl implements AccountService {

	AccountDao ad = new AccountDAOImpl();

	@Override
	public AccountDTO createService(Account account) {
		// TODO Auto-generated method stub
		Account act = ad.createAccount(account);
		return new ModelMapper().map(act, AccountDTO.class);

	}

}
