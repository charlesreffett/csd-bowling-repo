package com.example.demo;

public class UserStoryTotalForOneFrame {
	private int totalPins;
	public void resetTotalPins()
	{
		totalPins = 0;
	}
	
	public int getPins(int pinsFromBall) {
		   totalPins += pinsFromBall;
		   return totalPins;
	}

}
