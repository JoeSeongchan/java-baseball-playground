package number_baseball.domain;

import static number_baseball.domain.Constant.NUMBER_CNT;

import number_baseball.exception.BaseBallInvalidFieldException;

public class ComputerRandomNumbers {
	private int[] randomNumbers;

	public ComputerRandomNumbers(int[] randomNumbers) throws BaseBallInvalidFieldException {
		setRandomNumbers(randomNumbers);
	}

	public ComputerRandomNumbers() {
	}

	public int[] getRandomNumbers() {
		return randomNumbers;
	}

	public void setRandomNumbers(int[] randomNumbers) throws BaseBallInvalidFieldException {
		if(randomNumbers.length!=NUMBER_CNT){
			throw new BaseBallInvalidFieldException("randomNumbers","컴퓨터가 생성한 랜덤 숫자들은 개수가 "+NUMBER_CNT+"이어야 합니다.");
		}
		this.randomNumbers = randomNumbers;
	}

	public boolean equals(Prediction prediction) {
		for(int i=0;i< NUMBER_CNT;i++){
			if(randomNumbers[i]!=prediction.getNumberAt(i)){
				return false;
			}
		}
		return true;
	}
}
