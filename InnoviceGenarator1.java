package com.bridgelabz.day30;

public class InnoviceGenarator1 {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;

	public double CalculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		
	}
}
