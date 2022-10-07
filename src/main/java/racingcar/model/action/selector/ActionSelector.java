package racingcar.model.action.selector;

import racingcar.model.action.selector.result.ActionSelectorResult;
import racingcar.model.random.number.generator.GeneratedRandomNumber;

public interface ActionSelector {
    ActionSelectorResult select(GeneratedRandomNumber randomNumber);
}
