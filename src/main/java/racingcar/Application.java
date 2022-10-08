package racingcar;

import racingcar.controller.message.printer.MessagePrinter;
import racingcar.controller.user.input.CarNamesInput;
import racingcar.controller.user.input.NumberOfRoundInput;
import racingcar.controller.user.input.UserInput;
import racingcar.model.delimiter.CarNamesInputDelimiter;
import racingcar.model.delimiter.Delimiter;
import racingcar.model.finalwinner.FinalWinnerName;
import racingcar.model.finalwinner.FinalWinnersOfGame;
import racingcar.model.input.parser.InputParser;
import racingcar.model.input.parser.ParseResult;
import racingcar.model.input.parser.car.names.CarNamesInputParser;
import racingcar.model.input.parser.number.of.round.NumberOfRoundInputParser;
import racingcar.model.racing.car.RacingCarsInGame;
import racingcar.model.round.NumberOfRound;
import racingcar.view.result.message.CurrentRaceResultResultMessage;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        UserInput userInputCarNames = new CarNamesInput("A1, B2, C3");
        Delimiter delimiter = new CarNamesInputDelimiter(",");
        InputParser<ArrayList<String>> inputParserCarNames = new CarNamesInputParser(userInputCarNames, delimiter);
        ParseResult<ArrayList<String>> parseResultCarNames = inputParserCarNames.parse();

        UserInput userInputNumber = new NumberOfRoundInput("5");
        InputParser<Integer> inputParserNumber = new NumberOfRoundInputParser(userInputNumber);
        ParseResult<Integer> parseResultNumber = inputParserNumber.parse();

        RacingCarsInGame racingCarsInGame = new RacingCarsInGame(parseResultCarNames);
        NumberOfRound numberOfRound = new NumberOfRound(parseResultNumber);
        while (numberOfRound.hasNext()) {
            numberOfRound.next();
            racingCarsInGame.playOneRound();
        }

        CurrentRaceResultResultMessage currentRaceResultResultMessage =
                new CurrentRaceResultResultMessage(racingCarsInGame);
        MessagePrinter.println(currentRaceResultResultMessage);

        FinalWinnersOfGame finalWinnersOfGame = new FinalWinnersOfGame(racingCarsInGame);
        ArrayList<FinalWinnerName> finalWinnerNames = finalWinnersOfGame.getFinalWinnerNames();
        System.out.println("< finalWinnerNames >");
        for (FinalWinnerName finalWinnerName : finalWinnerNames) {
            System.out.println("  " + finalWinnerName.getName());
        }
    }
}
