import com.humanbooster.exercices.GuessNumber;
import com.humanbooster.exercices.Personne;

public class App {
    public static void main(String[] args) throws Exception {
        //ex1();
        ex2();
    }

    public static void ex1(){
        int MAX_ATTEMPTS = 1;
        boolean won = false;
        boolean replay = true;
        GuessNumber g = new GuessNumber(MAX_ATTEMPTS);

        int[] test = new int[2];
        for (int x : test){
            System.out.println("x: " + x);
        }
        while (replay){
            g.init();
            while (!won && !g.tooManyAttempts()){
                won = g.checkGuess(g.guess());
            }
            if ("no".equals(g.replay())) replay = false;
        }
        g.closeScan();
    }

    public static void ex2(){
        Personne[] p = new Personne[5];
        try {
            p[0] = new Personne();
            p[1] = new Personne("","test",1);
            //p[2] = new Personne("test", "", 1);
            //p[3] = new Personne("test", "test", -1);
            p[4] = new Personne("Je suis", "né à", 40);            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.println(p[4].toString());
    }
}
