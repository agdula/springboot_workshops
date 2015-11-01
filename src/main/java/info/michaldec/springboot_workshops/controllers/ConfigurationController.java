package info.michaldec.springboot_workshops.controllers;

import info.michaldec.springboot_workshops.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by michal on 2014-12-15.
 */

@Controller
@RequestMapping(value="/configure")
public class ConfigurationController {

    @Autowired
    private ConfigBean configurableBean;

    @RequestMapping(value = "/healthy",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String markHealthy() {
        configurableBean.setHealthy(true);
        return "Server marked healthy";
    }

    @RequestMapping(value = "/unhealthy",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String markUnhealthy() {
        configurableBean.setHealthy(false);
        return "Server marked unhealthy";
    }
}
