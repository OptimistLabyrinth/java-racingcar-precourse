package racingcar.view.error.message;

import racingcar.view.Message;

public class ErrorMessage implements Message {
    protected String value;

    protected ErrorMessage(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }
}
