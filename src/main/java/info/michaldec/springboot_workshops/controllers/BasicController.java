package info.michaldec.springboot_workshops.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by michal on 2014-12-15.
 */

@Controller
@RequestMapping(value="/controller")
public class BasicController {

    @RequestMapping(value = "/start",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String generateTraffic() {
        return "Traffic started...";
    }
}
