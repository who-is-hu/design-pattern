package proxy.aop;

public class AopProcessor implements Processor{

    private Runnable before;
    private Runnable after;
    private ProcessorImpl realProcessor;

    public AopProcessor(ProcessorImpl realProcessor, Runnable before, Runnable after) {
        this.realProcessor = realProcessor;
        this.before = before;
        this.after = after;
    }

    @Override
    public String process(String input) {
        before.run();

        // 1초가 걸리는 작업이라 가정
        String output = realProcessor.process(input);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        after.run();
        return output;
    }
}
