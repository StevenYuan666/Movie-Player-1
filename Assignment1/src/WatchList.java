import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WatchList{
	private String name;
	private Queue<Movie> watchList;
	
	public WatchList(String inputName) {
		this.setName(inputName);
		Queue<Movie> list =  new LinkedList<Movie>();
		this.watchList = list;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void add(Movie toWatch) {
		//avoid the reference escaping, so copy a movie object
		Movie toAdd = new Movie(toWatch);
		this.watchList.add(toAdd);
	}
	
	public void watchOne() {
		this.watchList.remove();
	}
	
	//Make a copy, so the client only able to access the information, but not to the reference
	public Movie[] accessAll(){
		int index = 0;
		Movie[] all = new Movie[this.watchList.size()];
		for(Movie m : this.watchList) {
			Movie copy = new Movie(m);
			all[index] = copy;
			index ++;
		}
		return all;
	}
	
	public int validMovies() {
		int num = 0;
		for(Movie m : this.watchList) {
			if(m.getValidity().equals(Status.Valid)) {
				num ++;
			}
		}
		return num;
	}
	
	//Use array as a list, since the array is immutable
	public String[] allStudios() {
		ArrayList<String> list = new ArrayList<String>();
		for(Movie m : this.watchList) {
			String s = m.getStudio();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		String[] studios = new String[list.size()];
		for(int i = 0; i < studios.length; i ++) {
			studios[i] = list.get(i);
		}
		return studios;
	}
	
	public String[] allLanguages() {
		ArrayList<String> list = new ArrayList<String>();
		for(Movie m : this.watchList) {
			String s = m.getLanguage();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		String[] languages = new String[list.size()];
		for(int i = 0; i < languages.length; i ++) {
			languages[i] = list.get(i);
		}
		return languages;
	}
}
	