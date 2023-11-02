
public class Match extends MatchSubject {

    private int score = 0;
    private int bowls = 0;
    String match;

    public Match(String match) {
        this.match = match;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        synchronized (this) {
            this.score = score;
            notifyObservers();
        }
    }

    public int getBowls() {
        return bowls;
    }

    public void setBowls(int bowls) {

        synchronized (this) {
            this.bowls = bowls;
            notifyObservers();
        }
    }

    public String getName() {
        return this.match;
    }

}
