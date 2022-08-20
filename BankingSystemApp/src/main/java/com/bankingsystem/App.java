package com.bankingsystem;

import com.bankingsystem.entity.Account;
import com.bankingsystem.model.AccountDTO;
import com.bankingsystem.service.AccountService;
import com.bankingsystem.service.AccountServiceImpl;

/**
 * Demo Test
 *
 */

public class App {

	public static void main(String[] args) {
		AccountService as = new AccountServiceImpl();
		Account account = new Account();
		account.setHolderName("samar");
		account.setAccbalance(50000);
		account.setEmail("samar@gmail.com");

		AccountDTO obj = as.createService(account);
		System.out.println(obj);
	}
}

//	public static void main(String[] args) {
//
//		AccountService as = new AccountServiceImpl();
//		String x = JOptionPane.showInputDialog("Enter choice", "type here");
//		switch (x) {
//		case "c":
//			Account account = new Account();
//			account.setHolderName("samar");
//			account.setAccbalance(50000);
//			account.setEmail("samar@gmail.com");
//
//			as.createService(account);
//			break;
//
//		case "r":
//			dao.readAccount(Integer.parseInt(JOptionPane.showInputDialog("Enter id", "type here")));
//			break;
//
//		case "u":
//			Account updateAcc = new Account();
//			updateAcc.setHolderName("samar mallik");
//			updateAcc.setAccbalance(60000);
//			updateAcc.setEmail("samarmallik@gmail.com");
//
//			dao.updateAccount(Integer.parseInt(JOptionPane.showInputDialog("enter id to update", "type here")),
//					updateAcc);
//			break;
//
//		case "d":
//			dao.deleteAccount(Integer.parseInt(JOptionPane.showInputDialog("enter id to delete", "type here")));
//			break;
//
//		default:
//			System.out.println("enter right choice");
//		}
//	}
