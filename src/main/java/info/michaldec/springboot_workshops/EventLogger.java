package info.michaldec.springboot_workshops;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by michaldec on 05/10/15.
 */
@Service
public class EventLogger {

    ScheduledExecutorService logger = Executors.newScheduledThreadPool(1);
    private final String LOG_PATTERN = "Number of visits: %s";
    private static final Log log = LogFactory.getLog(EventLogger.class);

    @Autowired
    private VisitCounter visitCounter;

    @Autowired
    private ConfigurationBean configurationBean;

    @PostConstruct
    public void startLogger() {
        logger.scheduleAtFixedRate(() -> {
            if (configurationBean.shouldLogVisit()) {
                log.info(String.format(LOG_PATTERN, visitCounter.getCounter()));
            }
        }, 1, 5, TimeUnit.SECONDS);

    }
}
