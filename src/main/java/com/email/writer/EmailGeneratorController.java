package com.email.writer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;
    public EmailGeneratorController(EmailGeneratorService emailGeneratorService){
        this.emailGeneratorService=emailGeneratorService;
    }

    @PostMapping("/generate")
    public Mono<String> generateEmail(@RequestBody EmailRequest emailRequest){
        return emailGeneratorService.generateEmailReply(emailRequest);
    }
}
