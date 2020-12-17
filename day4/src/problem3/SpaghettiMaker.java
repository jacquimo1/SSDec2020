package problem3;

import problem2.Spaghetti;


/*
 * This class acts as the producer, providing spaghetti so that the consumers
 * (philosophers) don't starve.
 */
public class SpaghettiMaker {
	// This method produces more spaghetti, then waits.
	public static void produce(Spaghetti s, int servings) {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					synchronized(s) {
						System.out.println("Another serving of spaghetti coming right up.");
						try {
							Thread.sleep(1000);
							s.addServings(servings);
							System.out.println("Spaghetti maker leaves " + s.getDescription());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
					try {
						System.out.println("Spaghetti maker returns to the kitchen and waits.");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		t.run();
	}
}
