package com.springGlow.Model;

/**
 * @author Sonali
 *@date 14-05-2021
 */
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class CartDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cart_Id;
	@Temporal(TemporalType.DATE)
	private Date cart_Date;
	@Temporal(TemporalType.DATE)
	private Date cart_StartDate;
	@Temporal(TemporalType.DATE)
	private Date cart_EndDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails cart_Customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BikeRateDetails cart_BikeRates;

}
