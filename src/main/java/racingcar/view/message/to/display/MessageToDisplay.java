package racingcar.view.message.to.display;

import racingcar.view.Message;

public class MessageToDisplay implements Message {
    protected String value;

    protected MessageToDisplay(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }
}
