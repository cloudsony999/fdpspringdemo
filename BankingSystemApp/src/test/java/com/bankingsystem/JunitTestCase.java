package com.bankingsystem;

import static org.assertj.core.api.Assertions.assertThat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bankingsystem.entity.Account;

class JunitTestCase {

	private static SessionFactory sessionFactory;
	private Session session;

	// creating session factory object
	@BeforeAll
	public static void setup() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("SessionFactory created");

	}

	// closing session factory object
	@AfterAll
	public static void tearDown() {
		if (sessionFactory != null)
			sessionFactory.close();
		System.out.println("SessionFactory destroyed");
	}

	// open session before each test case
	@BeforeEach
	public void openSession() {
		session = sessionFactory.openSession();
		System.out.println("Session created");
	}

	// close session after each test case
	@AfterEach
	public void closeSession() {
		if (session != null)
			session.close();
		System.out.println("Session closed\n");
	}

	// test method for createAccount
	@Test
	public void testCreate() {
		System.out.println("............Running testCreate............");
		Transaction tr = session.beginTransaction();
		Account b1 = Account.builder().holderName("ajay").accbalance(50000).email("ajay@gmail.com").build();
		Integer i = (Integer) session.save(b1);
		tr.commit();
		assertThat(i > 0).isTrue();

	}

	// testing read method
	@Test
	public void testRead() {
		Account b1 = Account.builder().holderName("raj").accbalance(50000).email("raj@gmail.com").build();
		session.save(b1);

		assertThat(b1.getAccbalance()).isEqualTo(50000);

	}

	// testing update method
	@Test
	public void testUpdate() {
		Account b1 = Account.builder().holderName("nibedita").accbalance(50000).email("nibedita@gmail.com").build();
		session.save(b1);
		b1.setHolderName("nibedita chatterjee");
		assertThat(b1.getHolderName()).isEqualTo("nibedita chatterjee");
	}

	// testing deposit method
	@Test
	public void testDeposit() {
		int accbal = 6000;
		Account b1 = Account.builder().holderName("john").accbalance(5000).email("john@gmaill.com").build();
		session.save(b1);
		b1.setAccbalance(b1.getAccbalance() + accbal);
		assertThat(b1.getAccbalance()).isEqualTo(11000);
	}
}
