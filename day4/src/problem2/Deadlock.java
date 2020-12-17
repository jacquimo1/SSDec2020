package problem2;

/* This is based on the Dining Philosophers Problem by Edsger Dijkstra.
 * Philosophers are sitting around a bowl of spaghetti, but there is a 
 * shortage of forks (or chopsticks, since you need two per eater) so not 
 * all philosophers can eat at the same time.  They must take turns eating 
 * and waiting or "thinking".
 */

public class Deadlock {

	public static void create() {
		Spaghetti s = new Spaghetti(2);
		
		Chopstick c1 = new Chopstick(1);
		Chopstick c2 = new Chopstick(2);
		
		Philosopher p1 = new Philosopher("Kant");
		Philosopher p2 = new Philosopher("Spinoza");
		p1.eat(c1, c2, s);
		p2.eat(c2, c1, s);
	}
}
