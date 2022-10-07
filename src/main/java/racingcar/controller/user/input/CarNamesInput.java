package racingcar.controller.user.input;

public class CarNamesInput implements UserInput<String> {
    private final UserInputValue<String> userInputValue;

    public CarNamesInput(String value) {
        this.userInputValue = new UserInputValue<>(value);
    }

    @Override
    public UserInputValue<String> getUserInputValue() {
        return userInputValue;
    }
}
