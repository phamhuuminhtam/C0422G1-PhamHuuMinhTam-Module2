package ss08_cleancode_refactoring.bai_tap;

public class TennisGame {
    public static void main(String[] args) {
        System.out.println(getScore("tâm","trí",1,1));
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1Score == player2Score) {
            if (player1Score>=4) System.out.println("Deuce");
            else System.out.println(returnNameScore(player1Score)+ "-All" );
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = new StringBuilder("Advantage " + player1Name);
            else if (minusResult == -1) score = new StringBuilder("Advantage " + player2Name);
            else if (minusResult >= 2) score = new StringBuilder("Win for " + player1Name);
            else score = new StringBuilder("Win for " + player2Name);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score.append("-");
                    tempScore = player2Score;
                }
                score.append(returnNameScore(tempScore));
            }
        }
        return score.toString();
    }
    public  static String returnNameScore(int score){
        String scoreName="";
        switch (score) {
            case 0:
                scoreName +="Love";
                break;
            case 1:
                scoreName+="Fifteen";
                break;
            case 2:
                scoreName+="Thirty";
                break;
            case 3:
                scoreName+="Forty";
                break;
        }
        return scoreName;
    }

}

