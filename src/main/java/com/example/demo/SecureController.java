package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecureController {

    @GetMapping("/customer")
    public Principal secureHome(Principal principal) {
        return principal;
    }
}
