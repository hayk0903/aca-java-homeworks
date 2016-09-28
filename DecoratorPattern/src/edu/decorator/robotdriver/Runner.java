package edu.decorator.robotdriver;

import edu.decorator.decorators.*;
import edu.decorator.simplerobot.*;


public class Runner {

	public static void main(String[] args) {
		SimpleRobot simpleRobot = new SimpleRobot();
		simpleRobot.walk();
		simpleRobot.talk();
		simpleRobot.scratchHead();
		
		Robot modifiedRobot1 = new ScratchAndBlinkDecorator(new TalkAndClapDecorator(simpleRobot));
		Robot modifiedRobot2 = new WalkAndSingDecorator(new ScratchAndBlinkDecorator(new SimpleRobot()));
		Robot modifiedRobot3 = new ScratchAndBlinkDecorator(new WalkAndSingDecorator(new TalkAndClapDecorator(new SimpleRobot())));
		
		modifiedRobot3.scratchHead();
		modifiedRobot3.talk();
		modifiedRobot3.walk();
	}

}
