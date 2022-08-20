package com.bankingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "account_details")
//uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class Account {
	@Id
	// @GenericGenerator(name = "anudip_seq", strategy =
	// "com.bankingsystem.AccountNoGenerator")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private int accno;

	@Column(length = 30)

	private String holderName;

	private long accbalance;
	@Column(length = 30, unique = true)

	private String email;
}
