import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Movie {
	
	final private String path;
	final private Formats format;
	private Status status;
	private Information<?, ?> info;
	
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
		Information<?, ?> inputInfo = new Information(inputTitle, inputLanguage, inputStudio);
		this.info = inputInfo;
	}
	
	//to Copy a movie object
	public Movie(Movie m) {
		this.path = m.path;
		this.format = m.format;
		this.status = m.status;
		Information<?, ?> newInfo = new Information(m.info);
		this.info = newInfo;
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
	
}
