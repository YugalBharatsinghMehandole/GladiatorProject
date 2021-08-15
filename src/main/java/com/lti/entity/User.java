package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_TABLE")
public class User{
	
	
	@Override
	public String toString() {
		return "UserTable [uid=" + uid + ", uaddress=" + uaddress + ", uemail=" + uemail + ", umobile=" + umobile
				+ ", ufname=" + ufname + ", ulname=" + ulname + ", upassword=" + upassword + "]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="U_ID")
	private int uid;
	
	@Column(name="U_ADDRESS")
	private String uaddress;
	
	@Column(name="U_EMAIL")
	private String uemail;
	
	@Column(name="U_MOBILE")
	private String umobile;
	
	@Column(name="U_FNAME")
	private String ufname;
	
	@Column(name="U_LNAME")
	private String ulname;
	
	@Column(name="U_PASSWORD")
	private String upassword;
	
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@Column(name="U_CARTID")
//    private int ucartid;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	public String getUfname() {
		return ufname;
	}

	public void setUfname(String ufname) {
		this.ufname = ufname;
	}

	public String getUlname() {
		return ulname;
	}

	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

//	public int getUcartid() {
//		return ucartid;
//	}
//
//	public void setUcartid(int ucartid) {
//		this.ucartid = ucartid;
//	}

	public User(int uid, String uaddress, String uemail, String umobile, String ufname, String ulname,
			String upassword, int ucartid) {
		super();
		this.uid = uid;
		this.uaddress = uaddress;
		this.uemail = uemail;
		this.umobile = umobile;
		this.ufname = ufname;
		this.ulname = ulname;
		this.upassword = upassword;
		//this.ucartid = ucartid;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
    
	
	
	
	
	
	
	
}
