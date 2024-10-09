package org.technischools.technibook.posts;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    List<Post> getAllPostsByUserUuid(String userUuid){
        return postRepository.findAllByUserUuid(userUuid);
    }
}
