package Observer;

import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver {
    public List<String> events = new ArrayList<>();

    public void updateState(int state) {
        events.add(Integer.toHexString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}
