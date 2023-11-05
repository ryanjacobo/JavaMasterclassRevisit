public class ifElseChallenge {
    public static void main(String[] args) {
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
        int finalScore = score;

        if(gameOver){
            finalScore += levelCompleted * bonus;
            System.out.println("Final Score: " + finalScore);
        }
    }
}
