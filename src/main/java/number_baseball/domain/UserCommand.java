package number_baseball.domain;

import java.util.HashMap;
import java.util.Map;
import number_baseball.exception.BaseBallInvalidFieldException;
import number_baseball.exception.BaseBallInvalidUserCommandException;

public enum UserCommand {
	NEW_GAME(1), EXIT(2);
	private final int value;
	private static final Map<Integer, UserCommand> map;

	static{
		UserCommand[] userCommands = UserCommand.values();
		map = new HashMap<>();
		for(UserCommand userCommand: userCommands){
			map.put(userCommand.value,userCommand);
		}
	}

	UserCommand(int value) {
		this.value = value;
	}

	public static UserCommand find(int value) throws BaseBallInvalidUserCommandException {
		UserCommand userCommand = UserCommand.map.get(value);
		if(userCommand == null){
			throw new BaseBallInvalidUserCommandException(""+value+"는 유효하지 않은 유저 커맨드입니다.");
		}
		return UserCommand.map.get(value);
	}
}
