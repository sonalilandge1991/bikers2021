package com.springGlow.Model;

/**
 * @author Sonali
 *@date 14-05-2021
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BikeRateDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bikerate_Id;
	private int bikerate_PerHour;
	private int bikerate_PerDay;
	private int bikerate_PerWeek;
	private int bikerate_Deposit;
}
