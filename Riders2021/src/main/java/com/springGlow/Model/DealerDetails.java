package com.springGlow.Model;

import java.time.LocalDate;
/**
 * @author Sonali
 *@date 14-05-2021
 */
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class DealerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealer_Id;
	private String dealer_Name;
	private String dealer_EmailId;
	private long dealer_MobileNumber;
	private long dealer_AdharId;
	private int dealer_BikesCount;
	
	//@Temporal(TemporalType.DATE)
	private LocalDate dealer_RegistrationDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails dealer_Login;
	
	@OneToOne(cascade = CascadeType.ALL.ALL)
	private AddressDetails dealer_Address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Images dealer_Image;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> dealer_Documents;
}
