package org.technischools.technibook.users;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document("users")
public class User {
    @Id
    private String id;
    private String uuid;
    private Date createdDate;
    private String email;
    private String password;
}
