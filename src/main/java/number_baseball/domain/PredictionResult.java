package number_baseball.domain;

import number_baseball.exception.BaseBallInvalidFieldException;

public class PredictionResult {
	private int ballCnt;
	private int strikeCnt;

	public static final int MAX_CNT = 3;

	public PredictionResult() {
	}

	public PredictionResult(int ballCnt, int strikeCnt) throws BaseBallInvalidFieldException {
		setBallCnt(ballCnt);
		setStrikeCnt(strikeCnt);
	}

	public int getBallCnt() {
		return ballCnt;
	}

	public void setBallCnt(int ballCnt) throws BaseBallInvalidFieldException {
		if(ballCnt<0 || ballCnt>MAX_CNT) {
			throw new BaseBallInvalidFieldException("ballCnt");
		}
		this.ballCnt = ballCnt;
	}

	public int getStrikeCnt() {
		return strikeCnt;
	}

	public void setStrikeCnt(int strikeCnt) throws BaseBallInvalidFieldException {
		if(strikeCnt<0 ||  strikeCnt>MAX_CNT){
			throw new BaseBallInvalidFieldException("strikeCnt");
		}
		this.strikeCnt = strikeCnt;
	}

	public boolean isStrikeThree(){
		return strikeCnt == MAX_CNT;
	}
}
