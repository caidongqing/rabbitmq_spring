package

mq.controller;

 

import

javax.annotation.Resource;

 

import

mq.service.ProducerMq;

 

import

org.springframework.stereotype.Controller;

import

org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
@RequestMapping(value = "/mq/")
public class MessageController {

    @Resource
    private ProducerMq producer;

    @RequestMapping("/producer")
    public String producer() throws Exception {

        for(int i=0;i<100;i++){
            producer.sendDataToCrQueue("data"+i);
        }
        return "index";
    }
}