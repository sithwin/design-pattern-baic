package com.design.pattern;

import com.design.pattern.flyBehaviour.FlyWithWings;
import com.design.pattern.quackBehaviour.NormalQuack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
		FlyWithWings flyWithWings = new FlyWithWings();
		NormalQuack normalQuack = new NormalQuack();

		MallardDuck mallardDuck = new MallardDuck(flyWithWings, normalQuack);
		mallardDuck.display();


		RedheadDuck redheadDuck = new RedheadDuck(flyWithWings, normalQuack);
		redheadDuck.display();

		RubberDuck rubberDuck = new RubberDuck();

		DecoyDuck decoyDuck = new DecoyDuck();
	}
}
