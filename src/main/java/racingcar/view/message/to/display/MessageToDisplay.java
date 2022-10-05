package racingcar.view.message.to.display;

import racingcar.view.Message;

public abstract class MessageToDisplay implements Message {
    protected String value;

    protected MessageToDisplay(String value) {
        this.value = value;
    }

    public abstract String getValue();
}
