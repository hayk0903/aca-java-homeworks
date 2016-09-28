package edu.decorator.decorators;

import edu.decorator.simplerobot.Robot;

public abstract class AbstractDecorator implements Robot {
	protected Robot decoratedRobot;

	public AbstractDecorator(Robot decoratedRobot) {
		this.decoratedRobot = decoratedRobot;
	}
	
	@Override
	public void scratchHead() {
		decoratedRobot.scratchHead();;
		
	}

	@Override
	public void walk() {
		decoratedRobot.walk();
		
	}

	@Override
	public void talk() {
		decoratedRobot.talk();
		
	}
	

}
