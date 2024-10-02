package org.technischools.technibook.users.api;

import lombok.Data;

@Data
public class SaveUserRequest {
    private String email;
    private String password;
}
