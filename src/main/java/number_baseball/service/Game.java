package number_baseball.service;

import number_baseball.RandomNumberGenerator;
import number_baseball.domain.ComputerRandomNumbers;
import number_baseball.domain.PredictionResult;

public class Game {

	private final ComputerRandomNumbers computerRandomNumbers;

	public Game() {
		RandomNumberGenerator generator=new RandomNumberGenerator();
		computerRandomNumbers=generator.generate();
	}

	public PredictionResult run(int inputUserNumber) {

		return null;
	}
}
