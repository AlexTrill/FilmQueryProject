package com.skilldistillery.filmquery.entities;

import java.util.List;
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
	private String language;
	
	
	

	private List<Actor> actors;

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

	public Film(String title2, String desc, int rYear, String rating2, String language, List<Actor> actors2) {
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

	public List<Actor> getActors() {
		return actors;
	}

	public List<Actor >setActors(List<Actor> actors) {
		return this.actors = actors;
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
		return String.format(
				"Film id: %s, title: %s, description:  %s, realeaseYear: %s, languageId: %s, rentalDuration: %s, rentalrate: %s, length: %s, replacementCost: %s, rating: %s, specialFeatures: %s, language: %s, actors: %s]",
				id, title, description, realeaseYear, languageId, rentalDuration, rentalrate, length, replacementCost,
				rating, specialFeatures, language, actors);
	}

	{
		// TODO Auto-generated method stub

	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
