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
public class DocumentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int document_Id;
	private String document_FileName;
	private String document_FileType;
	private String document_FilePath;
}
