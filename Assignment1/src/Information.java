import java.util.HashMap;
import java.util.Map;

public class Information<K,V> {
	
	final private String title;
	final private String language;
	final private String studio;
	private HashMap<K, V> custom;
	private static boolean ifNotCreated = true;
	
	public Information(String inputTitle, String inputLanguage, String inputStudio) {
		this.title = inputTitle;
		this.language = inputLanguage;
		this.studio = inputStudio;
	}
	
	//to Copy an information object
	public Information(Information<K, V> info) {
		this.title = info.title;
		this.language = info.language;
		this.studio = info.studio;
		HashMap<K, V> newCustom = new HashMap<K, V>(info.custom);
		this.custom = newCustom;
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
	public void addPair(K key, V value) {
		if(ifNotCreated) {
			ifNotCreated = false;
			this.custom = new HashMap<K, V>();
		}
		this.custom.put(key, value);
	}
	public void removePair(K key) {
		this.custom.remove(key);
	}
	public void modifyPair(K key, V changed) {
		this.custom.replace(key, changed);
	}
}



