package org.technischools.technibook.posts;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@Data
@Document("posts")
public class Post {
    @Id
    private String id;
    private Date createdDate;
    private Date updatedDate;
    private String uuid;
    private String userUuid;
    private String content;
}
