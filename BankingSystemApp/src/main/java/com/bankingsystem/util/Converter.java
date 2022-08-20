package com.bankingsystem.util;

import org.modelmapper.ModelMapper;

import com.bankingsystem.entity.Account;
import com.bankingsystem.model.AccountDTO;

public class Converter {

	private ModelMapper modelMapper;

	public Converter(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	public Converter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account convertToAccountEntity(AccountDTO acDTO) {
		Account ac = new Account();

		if (acDTO != null) {
			// convert DTO to entity
			ac = modelMapper.map(acDTO, Account.class);

		}

		return ac;
	}

	public AccountDTO convertToAccountDTO(Account ac) {
		AccountDTO acDTO = new AccountDTO();

		if (ac != null) {
			// convert entity to DTO
			acDTO = modelMapper.map(ac, AccountDTO.class);

		}

		return acDTO;
	}
}