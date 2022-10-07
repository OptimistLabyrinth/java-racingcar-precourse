package racingcar;

import racingcar.controller.input.acceptor.InputAcceptor;
import racingcar.controller.input.acceptor.NumberOfRoundInputAcceptor;
import racingcar.controller.message.printer.MessagePrinter;
import racingcar.controller.user.input.UserInput;
import racingcar.view.require.message.NumberOfRoundRequireInputMessage;

public class Application {
    public static void main(String[] args) {
        MessagePrinter.println(new NumberOfRoundRequireInputMessage());
        InputAcceptor inputAcceptor = new NumberOfRoundInputAcceptor();
        UserInput userInput = inputAcceptor.accept();
        System.out.println("userInput: " + userInput.getUserInputValue().getValue());
    }
}
