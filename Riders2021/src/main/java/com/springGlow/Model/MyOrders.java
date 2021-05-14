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
public class MyOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int myorder_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CartDetails myorder_Cart;
	
	
}
