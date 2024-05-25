package com.seminar.yes24.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final Environment env;
    private static final String NULL = "";

    @GetMapping("/profile")
    public String getProfile() {
        System.out.println("hit");
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse(NULL);
    }
}