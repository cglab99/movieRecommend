package moviePack;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<>();
		Movie m = new Movie("기생충", "봉주노");
		
		list.add( m );
		m = new Movie();  //*
		m.title = "모아나";
		m.director = "디즈니";
		list.add( m );
		list.add( new Movie("보헤미안", "??") );
		
		for(int i=0;i<list.size();i++) {
			System.out.println( list.get(i).title + ", "+  list.get(i).director );
		}
	}
}

class Movie {
	String title;
	String director;
	ImageIcon poster;
	static int counter = 0;
	
	Movie(){}
	
	Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	Movie(String title, String director, ImageIcon poster) {
		this.title = title;
		this.director = director;
		this.poster = poster;
	}

}
