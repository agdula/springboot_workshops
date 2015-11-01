package info.michaldec.springboot_workshops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by michaldec on 02/10/15.
 */
@Component
public class ConfigBean {

    private  boolean isHealthy;

    @Autowired
    public ConfigBean(@Value("${isHealthy}") boolean isHealthy, @Value("${customParam1}") String customParam1) {
        this.isHealthy = isHealthy;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }
}
