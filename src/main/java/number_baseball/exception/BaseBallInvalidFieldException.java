package number_baseball.exception;

public class BaseBallInvalidFieldException extends Exception {

	public BaseBallInvalidFieldException(String fieldName) {
		super("필드 '"+fieldName+"' 값이 유효하지 않습니다.");
	}

	public BaseBallInvalidFieldException(String fieldName, String cause){
		super("필드 '"+fieldName+"' 값이 유효하지 않습니다. | 원인 : "+cause);
	}
}
