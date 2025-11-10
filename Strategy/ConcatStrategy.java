package Strategy;

public class ConcatStrategy extends OperationStrategy {

    public int execute(int a, int b) {
        String s = String.valueOf(a)+String.valueOf(b);
        return Integer.parseInt(s);
    }
}
