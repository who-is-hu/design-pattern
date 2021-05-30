package proxy.aop;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        ProcessorImpl realProcessor = new ProcessorImpl();
        AtomicLong start = new AtomicLong();
        AtomicLong time = new AtomicLong();

        AopProcessor aopProcessor = new AopProcessor(realProcessor,
                () -> start.set(System.currentTimeMillis()),
                () -> time.set(System.currentTimeMillis() - start.get()));

        System.out.println(aopProcessor.process("data"));
        System.out.println("take :" + time + "ms");
    }
}
