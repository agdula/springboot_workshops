package info.michaldec.springboot_workshops.controllers;

import info.michaldec.springboot_workshops.VisitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by michaldec on 11/11/15.
 */
@Controller
@RequestMapping(value="/visit")
public class VisitController {

    @Autowired
    private VisitCounter visitCounter;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String visit() {
        visitCounter.increametCounter();
        return "Visit handled...";
    }
}
