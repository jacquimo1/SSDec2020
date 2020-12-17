package problem3;

import problem2.Chopstick;
import problem2.Philosopher;
import problem2.Spaghetti;

/* This is based on the Dining Philosophers Problem by Edsger Dijkstra.
 * Philosophers are sitting around a bowl of spaghetti, but there is a 
 * shortage of forks (or chopsticks, since you need two per eater) so not 
 * all philosophers can eat at the same time. They must take turns eating 
 * and waiting or "thinking".
 */

public class SpaghettiService {
	private Spaghetti s;
	private Chopstick c1, c2, c3;
	private Philosopher p1, p2;
	
	public void serve() {
		s = new Spaghetti(2);
		c1 = new Chopstick(1);
		c2 = new Chopstick(2);
		c3 = new Chopstick(3);
		p1 = new Philosopher("Russell");
		p2 = new Philosopher("Wittgenstein");
		
		p1.eat(c1, c2, s);
		p2.eat(c2, c3, s);
		SpaghettiMaker.produce(s, 1);
	}
	
	
}
