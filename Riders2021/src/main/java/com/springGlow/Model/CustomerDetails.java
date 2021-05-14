package com.springGlow.Model;

/**
 * @author Sonali
 *@date 14-05-2021
 */
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_Id;
	private String customer_Name;
	private String customer_EmailId;
	private long customer_MobileNumber;
	private long customer_AdharId;
	private String customer_LicenseNumber;
	private int customer_WalletBalance;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails customer_Address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> customer_Documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Images customer_Image;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails customer_Login;
}
