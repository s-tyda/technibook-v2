package org.technischools.technibook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.technischools.technibook.users.api.CreateUserRequest;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User createUser(CreateUserRequest createUserRequest) {
        User newUser = User.builder()
                .uuid(UUID.randomUUID().toString())
                .createdDate(new Date())
                .email(createUserRequest.getEmail())
                .password(createUserRequest.getPassword())
                .build();
        User createdUser = userRepository.save(newUser);
        return createdUser;
    }

    public User getUser(String uuid) {
        return userRepository.findByUuid(uuid);
    }
}
