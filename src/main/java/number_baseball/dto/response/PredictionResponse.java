package number_baseball.dto.response;

import number_baseball.domain.PredictionResult;

public class PredictionResponse {

	private String msg;

	public PredictionResponse(PredictionResult entity) {
		if(entity.isStrikeThree()){
			msg="3개의 숫자를 모두 맞히셨습니다! 게임 종료";
			return;
		}
		StringBuilder sb=new StringBuilder();
		if(entity.getBallCnt()>0){
			sb.append(entity.getBallCnt()).append('볼').append(' ');
		}
		if(entity.getStrikeCnt()>0){
			sb.append(entity.getStrikeCnt()).append("스트라이크").append(' ');
		}
		msg=sb.toString();
	}

	@Override
	public String toString() {
		return msg;
	}
}
