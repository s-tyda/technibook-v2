package org.technischools.technibook.users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUuid(String uuid);
    User findByEmailAndActivatedIsTrue(String email);
}
