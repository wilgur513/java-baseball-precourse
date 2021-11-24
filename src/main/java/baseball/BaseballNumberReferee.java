package baseball;

public class BaseballNumberReferee {
	private final BaseballNumberValidator validator;

	public BaseballNumberReferee(BaseballNumberValidator validator) {
		this.validator = validator;
	}

	public JudgeResult judge(String input, String number) {
		if(!validator.validate(input)) {
			throw new IllegalArgumentException(String.format("%s는 잘못된 입력값입니다.", input));
		}

		return new JudgeResult();
	}
}
