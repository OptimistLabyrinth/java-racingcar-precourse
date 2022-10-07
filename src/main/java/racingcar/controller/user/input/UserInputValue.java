package racingcar.controller.user.input;

public class UserInputValue<T> {
    private final T value;

    public UserInputValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
