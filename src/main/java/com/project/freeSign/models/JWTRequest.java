package com.project.freeSign.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JWTRequest {
    private String email;
    private String password;
}
