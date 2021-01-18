import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class WatchList{
	private String name;
	private Queue<Movie> watchList;
	
	public WatchList(String inputName) {
		this.name = inputName;
		Queue<Movie> list =  new LinkedList<Movie>();
		this.watchList = list;
	}
	
	public void add(Movie toWatch) {
		
	}
	
	public void watchOne() {
		this.watchList.remove();
	}
	
	//这里要改
	public Queue<Movie> accessAll(){
		return null;
	}
	
	
	
}
	