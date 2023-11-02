

public class Viewer2 extends MatchObserver {

    public Viewer2(Match matchSubject) {

        this.matchSubject = matchSubject;
        this.matchSubject.attach(this);

    }

    @Override
    public void update() {

        System.out
                .println("match Score: " + matchSubject.getScore() + "\n" + " match bowls: " + matchSubject.getBowls());

    }
}
