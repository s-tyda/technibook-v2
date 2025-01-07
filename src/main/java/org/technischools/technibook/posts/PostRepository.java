package org.technischools.technibook.posts;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
    Post findByUuid(String uuid);
}
