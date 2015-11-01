package info.michaldec.springboot_workshops;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by michaldec on 02/10/15.
 */

public class HealthCheckServlet extends HttpServlet {

    private ConfigBean configBean;

    public HealthCheckServlet(ConfigBean configBean) {
        this.configBean = configBean;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        if (configBean.isHealthy()) {
            response.setStatus(200);
        } else {
            response.setStatus(400);
        }
    }

}
