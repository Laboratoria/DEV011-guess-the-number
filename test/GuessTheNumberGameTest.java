import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class GuessTheNumberGameTest {
    @Test
    public void checkGuess(){
        GuessTheNumberGame game = mock(GuessTheNumberGame.class);
        HumanPlayer human = mock(HumanPlayer.class);
        when(game.checkGuess(human)).thenReturn(true);
        when(game.checkGuess(human)).thenReturn(false);
    }
}