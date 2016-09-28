package edu.decorator.decorators;

import edu.decorator.simplerobot.Robot;

public class WalkAndSingDecorator extends AbstractDecorator {

	public WalkAndSingDecorator(Robot decoratedRobot) {
		super(decoratedRobot);
	}
	
	public void walk() {
		System.out.println("La la la!");
		decoratedRobot.walk();
	}
}
