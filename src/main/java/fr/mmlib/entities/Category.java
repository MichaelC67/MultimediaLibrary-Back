package fr.mmlib.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3717300312990426668L;

	@Id
	@GeneratedValue
	private Long categoryID;
	
	private String description;
	
	@OneToMany(mappedBy="category")
	private List<Item> items = new ArrayList<>();

	public Long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
    


}
