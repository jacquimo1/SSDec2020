package problem1;

public class DclSingleton {
	private static volatile DclSingleton instance;
	private DclSingleton() {
		// Do whatever here.
	}
	
	private DclSingleton() {
		// Do whatever here.
	}
	
	public static DclSingleton getInstance() {
		if (instance == null) {
			synchronized (DclSingleton.class) {
				if (instance == null) {
					instance = new DclSingleton();
				}
			}
		}
		return instance;
	}
}
