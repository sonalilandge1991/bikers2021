package com.springGlow.Model;

import javax.persistence.CascadeType;

/**
 * @author Sonali
 *@date 14-05-2021
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class AdminDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_Id;
	private String admin_Name;
	private String admin_EmailId;
	private long admin_MobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails admin_Login;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails admin_Address;
	

}
