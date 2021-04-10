package fr.mmlib.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Borrow implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3159897126932421671L;

	@Id
	@GeneratedValue
	private Long borrowID;
	
	@ManyToOne
	private Item item;
	
	@ManyToOne
	private User user;
	
	private Date startingDate;
	
	private Date endingDate;

	public Long getBorrowID() {
		return borrowID;
	}

	public void setBorrowID(Long borrowID) {
		this.borrowID = borrowID;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	

	
	
	
}
