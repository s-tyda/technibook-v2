package org.technischools.technibook.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.posts.api.CreatePostRequest;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(CreatePostRequest createPostRequest) {
        Post newUser = Post.builder()
                .uuid(UUID.randomUUID().toString())
                .createdDate(new Date())
                .userUuid(createPostRequest.getUserUuid())
                .content(createPostRequest.getContent())
                .build();
        Post createdUser = postRepository.save(newUser);
        return createdUser;
    }

    public Post getPost(String uuid) {
        return postRepository.findByUuid(uuid);
    }
}
