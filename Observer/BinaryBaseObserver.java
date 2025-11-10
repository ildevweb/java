package Observer;

import java.util.ArrayList;
import java.util.List;

public class BinaryBaseObserver implements NumericBaseObserver {
    public List<String> events = new ArrayList<>();

    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}
