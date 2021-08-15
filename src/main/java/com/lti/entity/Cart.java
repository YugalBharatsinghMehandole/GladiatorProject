package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart_Table")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="U_CARTID")
	private int ucartid;
	
	
	@OneToOne
	@JoinColumn(name="u_id")
	private User user;


	public int getUcartid() {
		return ucartid;
	}


	public void setUcartid(int ucartid) {
		this.ucartid = ucartid;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
