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
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Queries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int query_Id;
	private String query_Name;
	private String  query_Details;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails query_Customer;
}
