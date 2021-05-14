package com.springGlow.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BikeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bike_Id;
	private String bike_Name;
	private String bike_Brand;
	private String bike_Model;
	private int bike_InsuranceNo;
	private int bike_ManufactureYear;
	
	@Temporal(TemporalType .DATE)
	private Date bike_InsuranceExpDate;
	
	private int bike_Enginecc;
	private String bike_Number;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Images> bike_Images;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> bike_Documents;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private DealerDetails bike_Dealer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AdminDetails bike_Admin;

}
