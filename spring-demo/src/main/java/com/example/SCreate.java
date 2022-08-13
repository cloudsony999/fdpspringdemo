package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class SCreate {

	private JdbcTemplate jt;// instance variable

	public SCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SCreate(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	@Override
	public String toString() {
		return "SCreate [jt=" + jt + "]";
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void createMyTable() {
		jt.execute("create table shruti(id number,name varchar2(22))");
		System.out.println("..............SQL DDL executed..........");
	}

}
