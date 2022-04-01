package com.skilldistillery.filmquery.entities;

import java.util.Objects;

public class Film {

	private int id;
	private String title;
	private String description;
	private Integer realeaseYear;
	private int languageId;
	private int rentalDuration;
	private Double rentalrate;
	private int length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;

	public Film() {
		super();
	}

	public Film(int id, String title, String description, Integer realeaseYear, int languageId, int rentalDuration,
			Double rentalrate, int length, double replacementCost, String rating, String specialFeatures) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.realeaseYear = realeaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalrate = rentalrate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRealeaseYear() {
		return realeaseYear;
	}

	public void setRealeaseYear(Integer realeaseYear) {
		this.realeaseYear = realeaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Double getRentalrate() {
		return rentalrate;
	}

	public void setRentalrate(Double rentalrate) {
		this.rentalrate = rentalrate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public String setRating(String rating) {
		return this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=").append(id).append(", ");
		if (title != null)
			builder.append("title=").append(title).append(", ");
		if (description != null)
			builder.append("description=").append(description).append(", ");
		if (realeaseYear != null)
			builder.append("realeaseYear=").append(realeaseYear).append(", ");
		builder.append("languageId=").append(languageId).append(", rentalDuration=").append(rentalDuration)
				.append(", ");
		if (rentalrate != null)
			builder.append("rentalrate=").append(rentalrate).append(", ");
		builder.append("length=").append(length).append(", replacementCost=").append(replacementCost)
				.append(", rating=").append(rating).append(", ");
		if (specialFeatures != null)
			builder.append("specialFeatures=").append(specialFeatures);
		builder.append("]");
		return builder.toString();
	}

	 {
		// TODO Auto-generated method stub
		
	}

}
