package com.design.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);

		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();

		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.display();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.fly();  // should not fly

		DecoyDuck decoyDuck = new DecoyDuck();
		decoyDuck.quack(); // should not quack
	}

}
