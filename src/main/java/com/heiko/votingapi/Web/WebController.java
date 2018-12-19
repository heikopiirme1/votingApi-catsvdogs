package com.heiko.votingapi.Web;

import com.heiko.votingapi.Producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    Producer producer;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/cats")
    public void sendCat(){
        producer.produceMsg("cats");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/dogs")
    public void sendDog(){
        producer.produceMsg("dogs");
    }
}
