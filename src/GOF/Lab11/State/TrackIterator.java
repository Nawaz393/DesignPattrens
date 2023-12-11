package GOF.Lab11.State;

import java.util.List;

public class TrackIterator implements Iterator {

    int current = 0;

    private Player player;
    private List<String> playList;

    public TrackIterator(Player player) {

        this.player = player;
        this.playList = player.getPlayList();

    }

    public boolean isEmpty() {
        return playList.isEmpty();
    }

    @Override
    public boolean hasNext() {

        if (isEmpty())
            return false;

        return playList.size() > current;

    }

    // 3 4>3 && 3>0

    // 4>0 && 0>0

    @Override
    public boolean hasPrevious() {
        return current > 0 && current <= playList.size();
    }

    @Override
    public String previous() {
        if (current < 0)
            return null;
        return playList.get(--current);
    }

    @Override
    public String next() {
        if (current > playList.size() - 1)
            return null;
        return playList.get(current++);

    }

}
