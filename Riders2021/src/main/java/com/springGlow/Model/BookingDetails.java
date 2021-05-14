package com.springGlow.Model;

/**
 * @author Sonali
 *@date 14-05-2021
 */

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_Id;
	private String booking_Image;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerDetails booking_Customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private BikeDetails booking_Bike;
}
