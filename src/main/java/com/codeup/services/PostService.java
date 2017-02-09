package com.codeup.services;

import com.codeup.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PapoteDetres1 on 2/9/17.
 */

@Service("postService")
public class PostService {
    private List<Post> posts= new ArrayList<>();

    private void PostService(){
        for(int i=0; i< 100; i++){
            posts.add(new Post(i+1,"Title"+(i+1),"Body"+(i+1)));
        }
    }

    public PostService() {
        PostService();
    }

    public Post save (Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOnePost(long id){

        return posts.get((int)id-1);
    }

    public List<Post> findAllPost(){

        return posts;
    }
}
