package com.skilldistillery.filmquery.entities;

public class Actor {
	private int id;
	private String firstName;
	private String lstName;

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLstName() {
		return lstName;
	}

	public void setLstName(String lstName) {
		this.lstName = lstName;
	}

	@Override
	public String toString() {
		return String.format("Actor id= %s, firstName: %s, lstName: %s", id, firstName, lstName);
	}

	public Actor() {
		super();
		this.id = id;

	}
	// TODO Auto-generated method stub

}
