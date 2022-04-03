package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws SQLException {
		FilmQueryApp app = new FilmQueryApp();
//		app.test();
		app.launch();
	}

	private void test() throws SQLException {
		Film film = db.findFilmById(1);
		System.out.println(film);

		Actor actor;

//		actor = db.findActorById(1);
//
//		System.out.println(actor);
//		
//		List<Actor> actors = db.findActorsByFilmId(1);
//		System.out.println(actors);

		for (Actor a : film.getActors()) {
			System.out.println(a);
		}
	}

	private void launch() {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);
		FilmQueryApp app = new FilmQueryApp();

		boolean loop = true;
		int idPick = 0;
		while (loop) {

			System.out.println("welcome!");
			System.out.println("what would you like to do?");
			System.out.println("\n");
			System.out.println("1. Look up film by id");
			System.out.println("2. Look up a film by a search keyword");
			System.out.println("3. Exit");
			int choice = input.nextInt();
			input.nextLine();
			

			if (choice >= 0 || choice <= 3) {

				switch (choice) {
				case 1:
					System.out.println("what is the film id you would like to look up?");

					try {
						idPick = input.nextInt();
						input.nextLine();
						
						Film filmByID = db.findFilmById(idPick);
						if (filmByID == null) {

							System.out.println("No movie found with that ID");
						}
						else {
							System.out.println(filmByID);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("Invalid input or too large of a number entered, please try again");
					}

					break;

				case 2:
					System.out.println("\n Please enter a keyword ");
					try {
						String keyword = input.nextLine();
						List<Film> films = db.findFilmByKeyWord(keyword);
						if (films.size() == 0) {
							System.out.println("Sorry, no films found with that keyword.");
						} else {
							for (Film film : films) {

								System.out.println(film);
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case 3:
					System.out.println("Goodbye!");
					loop = false;
					break;

				default:
					System.out.println(("Invalid selection, please select a number between 1 and 3"));
					break;
				}
			}
		}
		input.close();
	}

	private void startUserInterface(Scanner input) {
		// TODO: start menu loop, input, etc.

	}

}
