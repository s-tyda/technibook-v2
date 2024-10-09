package org.technischools.technibook.posts;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findAllByUserUuid(String userUuid);
    Optional<Post> findByUuid(String uuid);
}
