package number_baseball.controller;

import number_baseball.InputView;
import number_baseball.OutputView;
import number_baseball.domain.PredictionResult;
import number_baseball.domain.UserCommand;
import number_baseball.dto.response.PredictionResponse;
import number_baseball.exception.BaseBallInvalidUserCommandException;
import number_baseball.service.Game;

public class MainController {

	private final InputView inputView;
	private final OutputView outputView;

	public MainController() {
		inputView=new InputView();
		outputView=new OutputView();
	}

	public void runGame() throws BaseBallInvalidUserCommandException {
		Game game=new Game();
		while(true){
			int inputUserNumber=inputView.inputUserNumber();
			PredictionResult result=game.run(inputUserNumber);
			PredictionResponse response=new PredictionResponse(result);
			outputView.outputPredictionResult(response);
			// 스트라이크 개수가 3인 경우,
			if(result.isStrikeThree()){
				UserCommand userCommand = UserCommand.find(inputView.inputUserCommand());
				// 사용자가 '새 게임' 명령을 내린 경우,
				if(userCommand.equals(UserCommand.NEW_GAME)){
					game = new Game();
					continue;
				}
				// 사용자가 '게임 종료' 명령을 내린 경우,
				break;
			}
		}
	}

}
