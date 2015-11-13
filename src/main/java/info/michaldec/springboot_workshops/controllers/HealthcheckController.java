package info.michaldec.springboot_workshops.controllers;

import info.michaldec.springboot_workshops.ConfigurationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by michaldec on 11/11/15.
 */
@Controller
@RequestMapping(value="/healthcheck")
public class HealthcheckController {

    @Autowired
    private ConfigurationBean configBean;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public ResponseEntity<String> visit() {
        if (configBean.isHealthy()) {
            return new ResponseEntity<String>("OK",HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

}
