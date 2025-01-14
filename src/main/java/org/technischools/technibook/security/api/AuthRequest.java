package org.technischools.technibook.security.api;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
