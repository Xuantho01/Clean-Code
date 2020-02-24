public class TennisGame {

    public static String getScore(String firstNamePlayer, String secondNamePlayer, int ScoreOfFirstPlay, int ScoreOfSecondPlayer) {
        String SCORE = "";
        final int SCORE_ZERO = 0;
        int currentTemp = 0;
        final int SCORE_ONE = 1;
        boolean isEqualScore = ScoreOfFirstPlay == ScoreOfSecondPlayer;
        final int SCORE_TWO = 2;
        final int SCORE_THREE = 3;
        if (isEqualScore)
        {

            switch (ScoreOfFirstPlay)
            {
                case SCORE_ZERO:
                    SCORE = "Love-All";
                    break;
                case SCORE_ONE:
                    SCORE = "Fifteen-All";
                    break;
                case SCORE_TWO:
                    SCORE = "Thirty-All";
                    break;
                case SCORE_THREE:
                    SCORE = "Forty-All";
                    break;
                default:
                    SCORE = "Deuce";
                    break;

            }
        }
        else {
            boolean isScoreGreater4 = ScoreOfFirstPlay >= 4 || ScoreOfSecondPlayer >= 4;
            if (isScoreGreater4)
            {
                int minusResult = ScoreOfFirstPlay-ScoreOfSecondPlayer;
                if (minusResult==1) SCORE ="Advantage player1";
                else if (minusResult ==-1) SCORE ="Advantage player2";
                else if (minusResult>= SCORE_TWO) SCORE = "Win for player1";
                else SCORE ="Win for player2";
            }
            else
            {
                for (int i = 1; i< SCORE_THREE; i++)
                {
                    if (i==1) currentTemp = ScoreOfFirstPlay;
                    else { SCORE+="-"; currentTemp = ScoreOfSecondPlayer;}
                    switch(currentTemp)
                    {
                        case SCORE_ZERO:
                            SCORE+="Love";
                            break;
                        case 1:
                            SCORE+="Fifteen";
                            break;
                        case SCORE_TWO:
                            SCORE+="Thirty";
                            break;
                        case SCORE_THREE:
                            SCORE+="Forty";
                            break;
                    }
                }
            }
        }
        return SCORE;
    }
}
