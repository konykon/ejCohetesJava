package cohetes;

import java.util.ArrayList;
import java.util.List;

public class Rocket{  
	
	String code;
	List<Thruster> thrusters;
	
	public Rocket(String code) {
		this.setCode(code);
		this.thrusters = new ArrayList<Thruster>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Thruster> getThrusters() {
		return thrusters;
	}

	public void setThrusters(List<Thruster> thrusters) {
		this.thrusters = thrusters;
	}

	public void addThrusters(Thruster thruster) {
		this.getThrusters().add(thruster);
	}
	
	public void accelerate() {
		for (Thruster thruster : this.thrusters) {
			Thread thread = new Thread(thruster);  
			thread.start();
		}
	}

	public void slowDown() {
		for (Thruster thruster : this.thrusters) {
			Thread thread = new Thread(thruster);  
			thread.start();
		}
	}
	
	@Override
	public String toString() {
		return "Rocket [code=" + this.getCode() + ", thrusters=" + this.getThrusters() + "]";
	}

	
}
