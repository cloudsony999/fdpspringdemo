package com.bankingsystem.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bankingsystem.dao.AccountDao;
import com.bankingsystem.entity.Account;
import com.bankingsystem.entity.Helper;

public class AccountDAOImpl implements AccountDao {
	private static final Logger logger = LoggerFactory.getLogger(AccountDAOImpl.class);

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		try (Session session = Helper.getSession()) {

			// creating a new Account object
			session.beginTransaction();
			session.save(account);
			// java object saved to the database
			session.getTransaction().commit();
			session.clear();
			logger.info("new account created " + account.toString() + " and creation time is " + new java.util.Date());

			return account;
		} catch (HibernateException h) {
			System.out.println("The hibernate error is " + h);
			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("the error is " + e);

		}
		return null;

	}

//	@Override
//	public void readAccount(int accno) {
//		// TODO Auto-generated method stub
//		try (Session session = Helper.getSession()) {
//			Account ac = (Account) session.load(Account.class, accno);
//			System.out.println("Account holder name is: " + ac.getHolderName() + " Account Balance is: "
//					+ ac.getAccbalance() + " Email is: " + ac.getEmail());
//			logger.info("account details read  " + ac.toString() + " and time is " + new java.util.Date());
//
//		} catch (HibernateException h) {
//			System.out.println("The error is " + h);
//			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
//		} catch (Exception e) {
//			System.out.println("The general error is " + e);
//		}
//
//	}
//
//	@Override
//	public void updateAccount(int acno, Account a) {
//		// TODO Auto-generated method stub
//		try (Session session = Helper.getSession()) {
//			Account ac = (Account) session.load(Account.class, acno);
//			System.out.println("before update: " + ac);
//			ac.setHolderName(a.getHolderName());
//			ac.setAccbalance(a.getAccbalance());
//			ac.setEmail(a.getEmail());
//			session.beginTransaction();
//			session.saveOrUpdate(ac);
//			session.getTransaction().commit();
//			System.out.println("After update: " + ac);
//			logger.info("account updated  " + ac.toString() + " and time is " + new java.util.Date());
//
//		} catch (HibernateException he) {
//			System.out.println("the hibernate error is: " + he);
//			logger.error("exception happened " + he.toString() + " and error creation time is " + new java.util.Date());
//		} catch (Exception e) {
//			System.out.println("the hibernate error is: " + e);
//		}
//
//	}
//
//	@Override
//	public void deleteAccount(int accno) {
//		// TODO Auto-generated method stub
//		try (Session session = Helper.getSession()) {
//			Account accnt = session.load(Account.class, accno);
//
//			session.beginTransaction();
//			int input = JOptionPane.showConfirmDialog(null, "do you want to delete?",
//					"select what you want to delete or not?", JOptionPane.YES_NO_OPTION);
//			if (input == 0) {
//				session.delete(accnt);
//				JOptionPane.showMessageDialog(null, "Object is deleted!!!!...");
//				logger.info(accno + " account deleted " + " and the time is " + new java.util.Date());
//			} else
//				JOptionPane.showMessageDialog(null, "User want to retain it...");
//			session.getTransaction().commit();
//
//		} catch (HibernateException h) {
//			System.out.println("the hibernate error is " + h);
//			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
//		} catch (Exception h) {
//			System.out.println("the general error is " + h);
//		}
//
//	}

}
