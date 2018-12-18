package com.heiko.votingapi.Web;

import com.heiko.votingapi.Producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    Producer producer;

    @RequestMapping("/cats")
    public String sendCat(){
        producer.produceMsg("cats");
        return "Voted for cats!";
    }

    @RequestMapping("/dogs")
    public String sendDog(){
        producer.produceMsg("dogs");
        return "Voted for dogs!";
    }
}
