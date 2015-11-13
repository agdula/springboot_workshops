package info.michaldec.springboot_workshops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by michaldec on 02/10/15.
 */
@Component
public class ConfigurationBean {

    private  boolean isHealthy;
    private boolean shouldLogVisit;

    @Autowired
    public ConfigurationBean(@Value("${isHealthy}") boolean isHealthy, @Value("${shouldLogVisit}") boolean shouldLogVisit) {
        this.isHealthy = isHealthy;
        this.shouldLogVisit = shouldLogVisit;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public boolean shouldLogVisit() {
        return shouldLogVisit;
    }

    public void setShouldLogVisit(boolean shouldLogVisit) {
        this.shouldLogVisit = shouldLogVisit;
    }
}
