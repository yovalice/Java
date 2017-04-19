package com.javafundamentals.resources;

import com.javafundamentals.services.FlowControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//resource class for flow control example
@RestController
public class FlowControlResource {

    @Autowired
    FlowControlService flowControlService;

    //method mapping and calling the flowControl method
    //in the class FlowControlService
    @RequestMapping("/flowcontrol")
    public String flowcontrol(){
        return flowControlService.flowControl();
    }
}
