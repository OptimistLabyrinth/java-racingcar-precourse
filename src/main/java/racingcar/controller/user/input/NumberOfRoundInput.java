package racingcar.controller.user.input;

public class NumberOfRoundInput implements UserInput<Integer> {
    private final UserInputValue<Integer> userInputValue;

    public NumberOfRoundInput(Integer value) {
        this.userInputValue = new UserInputValue<>(value);
    }

    @Override
    public UserInputValue<Integer> getUserInputValue() {
        return userInputValue;
    }
}
