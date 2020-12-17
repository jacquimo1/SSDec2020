package problem2;

import java.util.ArrayList;
import java.util.List;

public class Spaghetti {
	private String description;
	private List<Integer> servings;
	
	public Spaghetti(int s) {
		this.servings = new ArrayList<Integer>();
		this.addServings(s);
		this.description = "a bowl containing " + servings + " servings of spaghetti.";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getServings() {
		return servings.size();
	}

	public void addServings(int servings) {
		this.servings.add(servings);
	}
	public void removeServings(int servings) {
		this.servings.remove(servings);
	}
}
