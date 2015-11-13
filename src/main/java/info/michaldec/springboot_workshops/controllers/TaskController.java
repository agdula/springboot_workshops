package info.michaldec.springboot_workshops.controllers;

import info.michaldec.springboot_workshops.ComputationTaskExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;

/**
 * Created by michaldec on 11/11/15.
 */
@Controller
@RequestMapping(value="/task")
public class TaskController {

    @Autowired
    private ComputationTaskExecutor computationTaskExecutor;

    @RequestMapping(value = "/submit/{number}",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String submitTaskToExecutor(@PathVariable("number") long number) {
        computationTaskExecutor.submitTaskToCompute(number);
        return "Task submitted...";
    }

}
