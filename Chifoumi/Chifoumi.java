package Chifoumi;

public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction action) {
        switch (action) {
            case ROCK:
                return ChifoumiAction.SCISSOR;
            case PAPER:
                return ChifoumiAction.ROCK;
            case SCISSOR:
                return ChifoumiAction.PAPER;
            default:
                throw new IllegalArgumentException("Unknown action: " + action);
        }
    }
}