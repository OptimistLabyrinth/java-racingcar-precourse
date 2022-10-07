package racingcar.model.round;

public class NumberOfRound implements Round {
    private int roundLeft;

    public NumberOfRound(int roundLeft) {
        this.roundLeft = roundLeft;
    }

    @Override
    public boolean hasNext() {
        return 0 < roundLeft;
    }

    @Override
    public void next() {
        --roundLeft;
    }
}
