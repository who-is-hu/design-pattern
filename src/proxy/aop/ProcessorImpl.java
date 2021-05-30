package proxy.aop;

public class ProcessorImpl implements Processor{

    @Override
    public String process(String input) {
        return "[processed] " + input;
    }
}
