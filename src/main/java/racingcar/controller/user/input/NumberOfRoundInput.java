package racingcar.controller.user.input;

public class NumberOfRoundInput implements UserInput<String> {
    private final UserInputValue<String> userInputValue;

    public NumberOfRoundInput(String value) {
        this.userInputValue = new UserInputValue<>(value);
    }

    @Override
    public UserInputValue<String> getUserInputValue() {
        return userInputValue;
    }
}
