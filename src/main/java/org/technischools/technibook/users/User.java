package org.technischools.technibook.users;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Document("users")
public class User {
    @Id
    private String id;
    private Date createdDate;
    private Date updatedDate;
    private String uuid;
    private String email;
    private String password;
    private boolean activated;
    private List<String> roles;
}
