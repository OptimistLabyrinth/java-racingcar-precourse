package racingcar.controller.input.acceptor;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.user.input.NumberOfRoundInput;
import racingcar.controller.user.input.UserInput;

public class NumberOfRoundInputAcceptor implements InputAcceptor {
    @Override
    public UserInput<Integer> accept() {
        final String numberOfRoundInputString = Console.readLine();
        int numberOfRoundInputInt = Integer.parseInt(numberOfRoundInputString);
        return new NumberOfRoundInput(numberOfRoundInputInt);
    }
}
