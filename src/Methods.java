public class Methods {
    public static void main(String[] args) {
        calculateScore(true, 10000, 8, 200);
        calculateScore(true, 800, 5, 100);

        System.out.println(calculateMyAge(1979));

        // challenge
        int position = calculateHighScorePosition(1001);
        String name = "Ryan";
        displayHighScorePosition(name, position);
        displayHighScorePosition("Martin", 2);
        displayHighScorePosition("Jane", calculateHighScorePosition(200));
        displayHighScorePosition("Bob", calculateHighScorePosition(-2000));
    }

    // methods
    // void
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//        boolean gameOver = true;
        int finalScore = score;

        if(gameOver){
            finalScore += levelCompleted * bonus;
            System.out.println("Final Score: " + finalScore);
        }
    }

    // return
    public static int calculateMyAge(int yearOfBirth){
        return 2023 - yearOfBirth;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score){
        int position = 0;
        if(score >= 1000){
            position = 1;
        } else if(score >= 500) {
           position = 2;
        } else if(score >= 100){
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
