import java.io.File;
import java.util.HashMap;

public class Movie {
	
	final private String path;
	final private Formats format;
	private Status status;
	
	final private String title;
	final private String language;
	final private String studio;
	private HashMap<String, String> custom;
	private static boolean ifNotCreated = true;
	
	public Movie(String inputPath, String inputTitle, String inputLanguage, String inputStudio) {
		//check if the input file with acceptable formats
		String inputFormat = inputPath.substring(inputPath.lastIndexOf(".") + 1);
		switch (inputFormat.toUpperCase()) {
			case "MP4":
				this.format = Formats.MP4;
				break;
			case "MOV":
				this.format = Formats.MOV;
				break;
			case "WMV":
				this.format = Formats.WMV;
				break;
			case "AVI":
				this.format = Formats.AVI;
				break;
			case "FLV":
				this.format = Formats.FLV;
				break;
			case "MKV":
				this.format = Formats.MKV;
				break;
			default:
				throw new AssertionError("Your input path is not matched with any acceptable path");
		}
		
		//Initialize the path field of the object
		this.path = inputPath;
		
		//check if the file exists or not
		File f = new File(inputPath);
		if(f.exists()) {
			this.status = Status.Valid;
		}
		else {
			this.status = Status.Invalid;
		}
		
		//Initialize the info
		this.title = inputTitle;
		this.language = inputLanguage;
		this.studio = inputStudio;
	}
	
	//to Deeply Copy a movie object(copy the information object meanwhile)
	public Movie(Movie m) {
		this.path = m.path;
		this.format = m.format;
		this.status = m.status;
		this.title = m.title;
		this.language = m.language;
		this.studio = m.studio;
		this.custom = new HashMap<String, String>(m.custom);
	}
	
	public Status getValidity() {
		return this.status;
	}
	
	//Update the status of the movie, to check if the file exists or not
	public void updateStatus() {
		File f = new File(this.path);
		if(f.exists()) {
			this.status = Status.Valid;
		}
		else {
			this.status = Status.Invalid;
		}
	}
	
	//Getters for the information
	public String getTitle() {
		return this.title;
	}
	public String getLanguage() {
		return this.language;
	}
	public String getStudio() {
		return this.studio;
	}
	public void addPair(String key, String value) {
		if(ifNotCreated) {
			ifNotCreated = false;
			this.custom = new HashMap<String, String>();
		}
		this.custom.put(key, value);
	}
	public void removePair(String key) {
		this.custom.remove(key);
	}
	public void modifyPair(String key, String changed) {
		this.custom.replace(key, changed);
	}
	
}
