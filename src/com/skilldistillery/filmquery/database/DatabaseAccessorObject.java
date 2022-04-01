package com.skilldistillery.filmquery.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class DatabaseAccessorObject implements DatabaseAccessor {

	private static final String URL = "jdbc:mysql://localhost:3306/sdvid?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=US/Mountain";

	String user = "student";
	String pass = "student";

	@Override
	public Film findFilmById(int filmId) {
		Film film = null;

		try {
			Connection conn = DriverManager.getConnection(URL, user, pass);
			String sql = "SELECT * FROM film WHERE id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, filmId);
			ResultSet rs = ps.executeQuery();
			{

				if (rs.next()) {
					film = new Film();
					film.setId(rs.getInt("id"));
					film.setTitle(rs.getString("title"));
					film.setDescription(rs.getString("description"));
					film.setRealeaseYear(rs.getInt("release_year"));
					film.setLanguageId(rs.getInt("language_id"));
					film.setRentalDuration(rs.getInt("rental_duration"));
					film.setRentalrate(rs.getDouble("rental_rate"));
					film.setLength(rs.getInt("length"));
					film.setReplacementCost(rs.getDouble("Replacement_cost"));
					film.setRating(rs.getString("rating"));
					film.setSpecialFeatures(rs.getString("special_features"));
					film.setActors(findActorsByFilmId(filmId));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return film;

	}

	@Override
	public Actor findActorById(int actorId) {
		Actor actor = null;
		try {
			Connection conn = DriverManager.getConnection(URL, user, pass);

			String sql = "SELECT id, first_name, last_name FROM actor WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, actorId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				actor = new Actor(); 
				actor.setId(rs.getInt(1));
				actor.setFirstName(rs.getString(2));
				actor.setLstName(rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actor;
	}

	public List<Actor> findActorsByFilmId(int filmId) {
		List<Actor> actors = new ArrayList<Actor>();
		
		try {
			Connection conn = DriverManager.getConnection(URL, user, pass);

			String sql = "select id, first_name, last_name FROM actor join film_actor on actor.id = film_actor.actor_id where film_actor.film_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, filmId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Actor actor = new Actor(); 
				actor.setId(rs.getInt(1));
				actor.setFirstName(rs.getString(2));
				actor.setLstName(rs.getString(3));
				actors.add(actor);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return actors;
	}
}
