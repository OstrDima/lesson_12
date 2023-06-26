package ua.ostr_2;

public class Engine {

	private int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}
}