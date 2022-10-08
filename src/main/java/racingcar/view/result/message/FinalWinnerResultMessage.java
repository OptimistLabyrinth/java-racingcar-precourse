package racingcar.view.result.message;

import racingcar.model.racing.car.RacingCarsInGame;

public class FinalWinnerResultMessage extends ResultMessage {
    public FinalWinnerResultMessage(RacingCarsInGame racingCarsInGame) {
        super(racingCarsInGame);
    }

    @Override
    public String getValue() {
        return null;
    }
}
