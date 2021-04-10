package fr.mmlib.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8192403021504421096L;

	@Id
	@GeneratedValue
	private Long libraryID;
	
	private String libraryName;

	public Long getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(Long libraryID) {
		this.libraryID = libraryID;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	

	
	

	
}
