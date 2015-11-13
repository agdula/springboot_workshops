package info.michaldec.springboot_workshops;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by michaldec on 11/11/15.
 */
@Service
public class ComputationTaskExecutor {

    private static final Log log = LogFactory.getLog(ComputationTaskExecutor.class);

    ExecutorService executorService = Executors.newFixedThreadPool(20);

    public void submitTaskToCompute(long number) {
        executorService.submit(new Runnable() {
            public void run() {
                    log.info("Result for:"+number+" is "+fibonacci(number));
            }
        });
    }

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
