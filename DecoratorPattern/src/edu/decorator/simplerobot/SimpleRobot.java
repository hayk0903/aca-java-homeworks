package edu.decorator.simplerobot;

public class SimpleRobot implements Robot {

	@Override
	public void scratchHead() {
		System.out.println("I am scratching my head");
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}

	@Override
	public void talk() {
		System.out.println("Hello!");
		
	}

}
