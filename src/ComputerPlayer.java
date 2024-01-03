import java.util.Random;

public class ComputerPlayer extends Player{
    Random random;
    public ComputerPlayer(){
        random= new Random();
    }
    @Override
    int makeGuess(){
        return random.nextInt(100);
    }
}
