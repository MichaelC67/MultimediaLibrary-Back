package fr.mmlib.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("G")
public class Game extends Item{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7950854326380744302L;

}
