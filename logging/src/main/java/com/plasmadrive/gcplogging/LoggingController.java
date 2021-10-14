package com.plasmadrive.gcplogging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class

LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    @RequestMapping("/hello")
    public String sayAndLogHello() {
        logger.info("Logging a request");
        return "Hello,world";
    }

    @RequestMapping("/log-error")
    public String logAndError() {
        logger.error("Ooops you hit an error");
        return "Ow!";
    }

    @RequestMapping("/throw-error")
    public String throwError() throws Exception {
        throw new Exception("Ouch");

    }

    @RequestMapping("/")
    public String index() {
        return "Home";
    }
}
