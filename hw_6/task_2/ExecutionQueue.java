package practice.hw_6.task_2;

public class ExecutionQueue {
    private static String msq;
    static {
        msq = "static block";
    }
    {
        msq = "reguar init block";
    }
    public ExecutionQueue(){
        msq = "constructor value";

    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(executionQueue.msq);
    }
}
