package com.talkdesk.sample.sso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("/user")
    public Principal principal(Principal user) {
        return user;
    }

}
