package com.springGlow.Model;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ReportDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int report_Id;
	private String report_Name;
	private String report_Type;
	
	@Temporal(TemporalType.DATE)
	private Date report_StartDate;
	
	@Temporal(TemporalType.DATE)
	private Date report_EndDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DealerDetails> report_Dealers;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MyOrders> report_MyOrders;
}
