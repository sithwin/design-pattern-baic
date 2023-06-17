package com.design.pattern.strategy;

import com.design.pattern.strategy.flyBehaviour.FlyWithWings;
import com.design.pattern.strategy.quackBehaviour.Quack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
		FlyWithWings flyWithWings = new FlyWithWings();
		Quack quack = new Quack();

		MallardDuck mallardDuck = new MallardDuck(flyWithWings, quack);
		mallardDuck.display();


		RedheadDuck redheadDuck = new RedheadDuck(flyWithWings, quack);
		redheadDuck.display();

		RubberDuck rubberDuck = new RubberDuck();

		DecoyDuck decoyDuck = new DecoyDuck();
	}
}
