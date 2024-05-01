package com.estsoft.paldotourism.controller;

import com.estsoft.paldotourism.dto.MailDto;
import com.estsoft.paldotourism.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

//    @GetMapping("/mail")
//    public String dispMail(){
//        return "mail";
//    }

    @PostMapping("/mail")
    public void execMail(){
        MailDto mailDto = mailService.setMailDto();
        mailService.mailSend(mailDto);
    }
}
