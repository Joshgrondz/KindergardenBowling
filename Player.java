public class Player {
    String playerName;
    int score;

    public Player(String Name){
        playerName = Name;
        score = 0;
    }

    public Player(String Name, int Score){
        playerName = Name;
        score = Score;
    }

    public void changeScore(int Score){
        score = Score;
    }

    public String getPlayerName(){
        return playerName;
    }

    public int getScore(){
        return score;
    }

    public String toString(){
        return playerName + " | Score: " + score;
    }

}

