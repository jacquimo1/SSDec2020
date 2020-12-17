package problem2;

public class Philosopher {
	private String name;
	public Philosopher(String givenName) {
		this.name = givenName;
	}
	public void eat(Chopstick c1, Chopstick c2, Spaghetti s) {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					System.out.println(name + " tries to grab chopstick " + c1.getId());
					synchronized(c1) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(name + " tries to grab chopstick " + c2.getId());
						synchronized (c2) {
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if (s.getServings() == 0) {
								System.out.println(name + " has nothing to eat!");
							}
							else {
								
								System.out.println(name + " takes chopstick " + c2.getId() +" then begins eating the spaghetti.");
								try {
									Thread.sleep(1000);
									s.removeServings(1);
									System.out.println(name + " leaves " + s.getServings() + " serving/s of spaghetti remaining.");
								} catch (InterruptedException e) {
									e.printStackTrace();
								}

							}
	
						}
						System.out.println(name + " puts down chopstick " + c2.getId() + " and thinks for a while.");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
	
				}
	   
	        }
		};
		t.start();
	}
}
