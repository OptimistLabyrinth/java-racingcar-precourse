package racingcar.model.input.validator;

import racingcar.controller.user.input.UserInput;
import racingcar.model.delimiter.Delimiter;
import racingcar.model.validate.result.ValidateResult;

public interface InputValidator {
    ValidateResult validate(UserInput userInput, Delimiter delimiter);
}
