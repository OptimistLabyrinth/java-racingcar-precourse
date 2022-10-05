package racingcar.view.require.message;

import racingcar.view.Message;

public class RequireMessage implements Message {
    protected String value;

    protected RequireMessage(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
