

import java.util.ArrayList;
import java.util.List;

public abstract class MatchSubject {
    List<MatchObserver> matchObservers = new ArrayList<>();

    public void notifyObservers() { 
        for (MatchObserver observer : matchObservers) {
            observer.update();
        }
    }

    public void attach(MatchObserver observer) {
        matchObservers.add(observer);
    }

    public void detach(MatchObserver observer) {
        matchObservers.remove(observer);
    }
}
