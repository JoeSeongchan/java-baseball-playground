package number_baseball.domain;

import java.security.InvalidParameterException;
import number_baseball.exception.BaseBallInvalidFieldException;

public class Prediction {
	private final int[] values;


	public Prediction(int value) throws BaseBallInvalidFieldException {
		char[] charValues= String.valueOf(value).toCharArray();
		if(charValues.length!=Constant.NUMBER_CNT){
			throw new BaseBallInvalidFieldException("values","길이가 "+Constant.NUMBER_CNT+" 이 아닙니다.");
		}
		for(int i=0;i<Constant.NUMBER_CNT;i++){
			if(Character.getNumericValue(charValues[i])==0){
				throw new BaseBallInvalidFieldException("values","0이 섞여 있습니다.");
			}
		}
		values=new int[Constant.NUMBER_CNT];
		for(int i=0;i<Constant.NUMBER_CNT;i++){
			values[i]=Character.getNumericValue(charValues[i]);
		}
	}

	int getNumberAt(int index) {
		if(index<0 || index>Constant.NUMBER_CNT){
			throw new InvalidParameterException("Index 값은 0 이상 "+Constant.NUMBER_CNT+"이하여야 합니다.");
		}
		return values[index];
	}

}
