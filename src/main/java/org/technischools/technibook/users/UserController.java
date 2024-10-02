package org.technischools.technibook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.technischools.technibook.users.api.SaveUserRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{uuid}")
    public User getUserByUuid(@PathVariable("uuid") String uuid){
        return userService.getUserByUuid(uuid);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createUser(@RequestBody SaveUserRequest saveUserRequest){
        userService.saveUser(saveUserRequest);
    }
}
