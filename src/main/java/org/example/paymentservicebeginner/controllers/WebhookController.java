package org.example.paymentservicebeginner.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/stripeWebhook")
    public String receiveEvents(@RequestBody String e) {
        System.out.println(e);
        //We can do lot of stuff here
        return e;
    }
}
