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
public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int images_Id;
	private String images_String;
	
}
