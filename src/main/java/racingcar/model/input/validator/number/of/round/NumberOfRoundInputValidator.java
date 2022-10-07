package racingcar.model.input.validator.number.of.round;

import racingcar.controller.user.input.UserInput;
import racingcar.model.delimiter.Delimiter;
import racingcar.model.input.validator.InputValidator;
import racingcar.model.input.validator.ValidateResult;

public class NumberOfRoundInputValidator implements InputValidator {
    private final UserInput userInput;
    private final Delimiter delimiter;

    public NumberOfRoundInputValidator(UserInput userInput, Delimiter delimiter) {
        this.userInput = userInput;
        this.delimiter = delimiter;
    }

    @Override
    public ValidateResult validate() {
        return new NumberOfRoundValidateResult();
    }
}
