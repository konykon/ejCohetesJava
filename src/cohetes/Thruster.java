package cohetes;

public class Thruster implements Runnable {

	int id;
	int actualPower;
	int maxPower;
	int targetPower;

	public Thruster(int id, int actualPower, int maxPower, int targetPower) {
		this.setId(id);
		this.setActualPower(actualPower);
		this.setMaxPower(maxPower);
		this.setTargetPower(targetPower);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActualPower() {
		return actualPower;
	}

	public void setActualPower(int actualPower) {
		this.actualPower = actualPower;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getTargetPower() {
		return targetPower;
	}

	public void setTargetPower(int targetPower) {
		this.targetPower = targetPower;
	}

	public void run() {
		while (this.getActualPower() != this.getTargetPower() && this.getActualPower() < this.getMaxPower()) {
			if (this.getActualPower() < this.getTargetPower()) {
				this.setActualPower(this.getActualPower() + 10);
				System.out.println("thruster " + this.getId() + ": accelerated, actual power: " + this.getActualPower());
			} else if (this.getActualPower() > this.getTargetPower() && this.getActualPower() > 0) {
				this.setActualPower(this.getActualPower() - 10);
				System.out.println("thruster " + this.getId() + ": slowed down, actual power: " + this.getActualPower());
			}
		}
	}

	@Override
	public String toString() {
		return "Thruster " + this.getId() + " [actualPower=" + this.getActualPower() + ", maxPower="
				+ this.getMaxPower() + ", targetPower=" + this.getTargetPower() + "]";
	}

}
