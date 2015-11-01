package info.michaldec.springboot_workshops;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by michaldec on 05/10/15.
 */
@Component
public class VisitCounter {

    AtomicInteger counter = new AtomicInteger();

    public void increametCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

}
