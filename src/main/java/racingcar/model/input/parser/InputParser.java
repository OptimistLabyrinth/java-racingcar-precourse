package racingcar.model.input.parser;

import racingcar.controller.user.input.UserInput;
import racingcar.model.delimiter.Delimiter;
import racingcar.model.parse.result.ParseResult;

public interface InputParser {
    ParseResult parse(UserInput userInput, Delimiter delimiter);
}
