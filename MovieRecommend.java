import java.awt.*;
import javax.swing.*;

public class MovieRecommand {

	public static void main(String[] args) {

		JFrame frame = new JFrame("영화추천");
		JLabel lblMovie = new JLabel();
		JButton btnLeft = new JButton("<");
		JButton btnRight = new JButton(">");
		ImageIcon poster;
		
		Movie[] movieList = new Movie[3];
		movieList[0] = new Movie( "스파이더맨", "마블");
		poster = new ImageIcon("image//스파이더맨.jpg");
		movieList[0].poster = poster;
		movieList[1] = new Movie( "존윅", "키아누");
		movieList[1].poster = new ImageIcon("image//존윅.jpg");
		movieList[2] = new Movie( "조커", "호아킨", new ImageIcon("image//조커.jpg") );
		
		frame.setBounds(100, 100, 500, 500);
		frame.setLayout(new FlowLayout());
		
		frame.add(btnLeft);
		frame.add(lblMovie);
		frame.add(btnRight);

		lblMovie.setIcon( movieList[0].poster );
		btnLeft.addActionListener( e -> {
			if( Movie.position != 0 ) Movie.position--;
			else Movie.position = movieList.length - 1;
			lblMovie.setIcon( movieList[Movie.position].poster );
			frame.setTitle( (Movie.position+1) + movieList[Movie.position].title );
		});
		btnRight.addActionListener( e -> {
			if( Movie.position != (movieList.length-1) ) Movie.position++;
			else Movie.position = 0;
			lblMovie.setIcon( movieList[Movie.position].poster );
			frame.setTitle( (Movie.position+1) + movieList[Movie.position].title );
		});
		frame.setVisible(true);
	}

}

class Movie {
	String title;
	String director;
	ImageIcon poster;
	static int position=0;
	
	Movie(String title, String director){
		this.title = title;
		this.director = director;
	}
	Movie(String title, String director, ImageIcon poster){
		this.title = title;
		this.director = director;
		this.poster = poster;   
	}
}
