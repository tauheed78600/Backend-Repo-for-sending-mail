package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.service.EmailService;

@RestController
@RequestMapping("/v1/m")
@CrossOrigin
public class MailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/submit")
    public ResponseEntity<String> sendEmail(@RequestBody Contact contact) {
    	System.out.println("cjfshbsdjk");
    	String subject = "Mail from yout Portfolio";
        emailService.sendSimpleMessage("tauheeddarekar786@gmail.com", subject, contact.getMessage());
        return new ResponseEntity<>("Email sent successfully!", HttpStatus.OK);

    }
}
