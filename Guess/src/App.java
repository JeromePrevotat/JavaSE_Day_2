import com.humanbooster.exercices.GuessNumber;

public class App {
    public static void main(String[] args) throws Exception {
        int MAX_ATTEMPTS = 1;
        boolean won = false;
        boolean replay = true;
        GuessNumber g = new GuessNumber(MAX_ATTEMPTS);

        while (replay){
            g.init();
            while (!won && !g.tooManyAttempts()){
                won = g.checkGuess(g.guess());
            }
            if ("no".equals(g.replay())) replay = false;
        }
        g.closeScan();
    }
}
