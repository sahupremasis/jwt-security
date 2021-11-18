package com.security.jwtsecurity.controller;

import com.security.jwtsecurity.security.JwtGenerator;
import com.security.jwtsecurity.model.JwtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        jwtGenerator = new JwtGenerator();
        String generatedToken = jwtGenerator.generate(jwtUser);
        System.out.println("generatedToken is:" + generatedToken);
        return generatedToken;
    }
}
