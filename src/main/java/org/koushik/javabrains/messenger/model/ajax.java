package org.koushik.javabrains.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ajax {
	private long id ;
	private String name ;
	private String number;
	
	public ajax() {
	}
	
	public ajax(long id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public ajax(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
