package com.purav.auth_service.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
public class OAuth2Controller {

    @GetMapping("/auth/github-success")
    public String githubLogin(@AuthenticationPrincipal OAuth2User principal) {
        String email = principal.getAttribute("email");
        return "Logged in via GitHub as: " + email;
    }
}