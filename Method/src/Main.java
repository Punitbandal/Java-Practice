public class Main {
    public static void main(String[] args) {

        int x = calculateScore(true, 1000, 8, 2);
        int y = calculateScore(true, 4000, 18, 22);
        System.out.println(x + " " + y);


        int highScore = calculateHighScorePosition(1200);
        displayHighScorePositions("sam", highScore);
        highScore = calculateHighScorePosition(900);
        displayHighScorePositions("don", highScore);
        highScore = calculateHighScorePosition(200);
        displayHighScorePositions("Ram", highScore);
        highScore = calculateHighScorePosition(50);
        displayHighScorePositions("sham", highScore);
        highScore = calculateHighScorePosition(500);
        displayHighScorePositions("sham", highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your Final Score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePositions(String playerName, int position) {
        System.out.println(playerName + " manage to get into position " + position + " on score Table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100)
            return 3;
        else
            return 4;


    }
}