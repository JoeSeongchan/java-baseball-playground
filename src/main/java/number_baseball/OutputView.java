package number_baseball;

import number_baseball.dto.response.PredictionResponse;

public class OutputView {
		public void outputPredictionResult(PredictionResponse response){
			System.out.println(response);
		}

		public void outputDescriptionBeforeInputUserNumber(){
			System.out.print("숫자를 입력해 주세요 : ");
		}

		public void outputDescriptionBeforeInputUserCommand(){
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		}
}
