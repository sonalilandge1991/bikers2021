package com.springGlow.Model;


/**
 * @author Sonali
 *@date 14-05-2021
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int login_Id;
	private String login_Username;
	private String login_Password;
	private String login_Status;
	

}
