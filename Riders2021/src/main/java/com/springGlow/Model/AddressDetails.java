package com.springGlow.Model;

/**
 * @author Sonali
 *@date 14-05-2021
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Lazy;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class AddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_Id;
	private String street;
	private String landmark;
	private String city;
	private long pincode;
	private String state;
	
	
}
