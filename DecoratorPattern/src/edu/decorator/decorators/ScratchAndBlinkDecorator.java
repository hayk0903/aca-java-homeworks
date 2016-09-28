package edu.decorator.decorators;

import edu.decorator.simplerobot.Robot;

public class ScratchAndBlinkDecorator extends AbstractDecorator  {

	public ScratchAndBlinkDecorator(Robot decoratedRobot) {
		super(decoratedRobot);
	}
	
	public void scratchHead(){
		System.out.println("I am blinking my eyes.");
		decoratedRobot.scratchHead();
	}
}
