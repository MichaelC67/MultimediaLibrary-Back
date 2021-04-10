package fr.mmlib.entities;

public enum EItemType { 
	
	BOOK("B","book","books"), GAME("G","game","games") , CD ("C","cd","cds");

	private String discriminatorValue;
	private String shortName;
	private String shortNamePlural;

	private EItemType(String discriminatorValue,String shortName,String shortNamePlural) {
		this.discriminatorValue = discriminatorValue;
		this.shortName=shortName;
		this.shortNamePlural=shortNamePlural;
	}

	public String getDiscriminatorValue() {
		return discriminatorValue;
	}

	public String getShortName() {
		return shortName;
	}

	public String getShortNamePlural() {
		return shortNamePlural;
	}

	
	
	
	
}
