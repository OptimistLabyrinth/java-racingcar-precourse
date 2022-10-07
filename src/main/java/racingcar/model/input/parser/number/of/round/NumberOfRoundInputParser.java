package racingcar.model.input.parser.number.of.round;

import racingcar.controller.user.input.UserInput;
import racingcar.model.delimiter.Delimiter;
import racingcar.model.input.parser.InputParser;
import racingcar.model.input.parser.ParseResult;

public class NumberOfRoundInputParser implements InputParser<Integer> {
    private final UserInput userInput;
    private final Delimiter delimiter;

    public NumberOfRoundInputParser(UserInput userInput, Delimiter delimiter) {
        this.userInput = userInput;
        this.delimiter = delimiter;
    }

    @Override
    public ParseResult<Integer> parse() {
        return new NumberOfRoundParseResult(null);
    }
}
