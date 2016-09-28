package edu.decorator.decorators;

import edu.decorator.simplerobot.Robot;

public class TalkAndClapDecorator extends AbstractDecorator {

	public TalkAndClapDecorator(Robot decoratedRobot) {
		super(decoratedRobot);
	}
	
	public void talk() {
		System.out.println("I am clapping my hands");
		decoratedRobot.talk();
		
	}
}
