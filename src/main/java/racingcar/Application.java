package racingcar;

import racingcar.controller.input.acceptor.CarNamesInputAcceptor;
import racingcar.controller.input.acceptor.InputAcceptor;
import racingcar.controller.message.printer.MessagePrinter;
import racingcar.controller.user.input.UserInput;
import racingcar.view.require.message.CarNamesRequireInputMessage;

public class Application {
    public static void main(String[] args) {
        MessagePrinter.println(new CarNamesRequireInputMessage());
        InputAcceptor inputAcceptor = new CarNamesInputAcceptor();
        UserInput userInput = inputAcceptor.accept();
        System.out.println("userInput: " + userInput.getUserInputValue().getValue());
    }
}
