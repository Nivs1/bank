package com.accenture.aa.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends User {

	//column specifies outside parent cannot be null
	@Column(name = "ADDRESS")
	private String address;

}
