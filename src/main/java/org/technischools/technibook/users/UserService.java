package org.technischools.technibook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.users.api.SaveUserRequest;

import java.util.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserByUuid(String uuid){
        return userRepository.findByUuid(uuid);
    }

    public void saveUser(SaveUserRequest saveUserRequest){
        User user = User.builder()
                .uuid(UUID.randomUUID().toString())
                .createdDate(new Date())
                .email(saveUserRequest.getEmail())
                .password(saveUserRequest.getPassword())
                .build();
        userRepository.save(user);
    }
}
