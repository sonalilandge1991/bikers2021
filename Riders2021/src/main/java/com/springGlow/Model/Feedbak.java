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

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Feedbak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedback_Id;
	private String feedback_Name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<CustomerDetails> feedback_Customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<AdminDetails> feedback_Admin;
}
