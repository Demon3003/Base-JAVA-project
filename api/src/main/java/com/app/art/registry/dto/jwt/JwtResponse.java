package com.app.art.registry.dto.jwt;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JwtResponse {

    private String login;

    private String accessToken;

    private String refreshToken;

    @Override
    public String toString() {
        return "JwtResponse{" +
                "login='" + login + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
