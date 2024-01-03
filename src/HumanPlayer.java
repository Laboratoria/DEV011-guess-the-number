public class HumanPlayer extends Player {

    @Override
    int makeGuess() {
        return getGuesses()[guesses.length-1];
    }
}
