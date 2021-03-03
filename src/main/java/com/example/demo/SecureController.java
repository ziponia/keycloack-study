package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/customer")
    public Object secureHome(Authentication authentication) {
        System.out.println("principal: " + authentication.getName());
        System.out.println(authentication.getAuthorities().toString());

        // ex) 00a799f1-c8c5-4061-9928-2d1fdbabad8b - [ROLE_offline_access, ROLE_user, ROLE_uma_authorization]
        return authentication.getName() + " - " + authentication.getAuthorities();

    }

    @GetMapping(value = "/user")
    public Object user(Authentication authentication) {
        return authentication;
    }
}
