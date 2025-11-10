package Strategy;

public class Context {
    public OperationStrategy operationStrategy;

    public Context() {
        operationStrategy = new OperationStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        return this.operationStrategy.execute(a, b);
    }
}
