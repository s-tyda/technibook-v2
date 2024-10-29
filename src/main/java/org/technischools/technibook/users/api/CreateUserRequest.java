package org.technischools.technibook.users.api;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String password;
}
