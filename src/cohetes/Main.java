package cohetes;

public class Main {

	public static void main(String[] args) {
		
		Rocket r1 = new Rocket("32WESSDS");
		Rocket r2 = new Rocket("LDSFJA32");
		
		int r1thrusters[] = {10, 30, 80};
		int r2thrusters[] = {30, 40, 50, 50, 30, 10};
		
		for (int i = 0; i < r1thrusters.length; i++) {
			r1.addThrusters(new Thruster(i, r1thrusters[i], r1thrusters[i]+50, 40));
		}
		
		for (int i = 0; i < r2thrusters.length; i++) {
			r2.addThrusters(new Thruster(i, r2thrusters[i], r2thrusters[i]+50, 40));
		}

		System.out.println(r1);		
		r1.accelerate();	
		r1.slowDown();	
		
		System.out.println(r2);
		r2.accelerate();	
		r2.slowDown();	
		
	}

}
