package com.email.writer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {


    private final EmailGeneratorService emailGeneratorService;
    public EmailGeneratorController(EmailGeneratorService emailGeneratorService){
        this.emailGeneratorService=emailGeneratorService;
    }

    @CrossOrigin(origins="*")
    @PostMapping("/generate")
    public Mono<String> generateEmail(@RequestBody EmailRequest emailRequest){
        return emailGeneratorService.generateEmailReply(emailRequest);
    }
}
