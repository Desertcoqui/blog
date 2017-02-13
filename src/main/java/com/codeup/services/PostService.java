package com.codeup.services;

import com.codeup.model.Post;
import com.codeup.repositories.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by PapoteDetres1 on 2/9/17.
 */

@Service("postService")
public class PostService {

    @Autowired
    Posts postsDao;

//     private Iterable<Post> posts= new ArrayList<>();

//    private void PostService(){
//        for(int i=0; i< 100; i++){
//            posts.add(new Post(i+1,"Title"+(i+1),"Body"+(i+1)));
//        }
//    }


    public PostService() {
        createPosts();
    }

    private void createPosts(){

    }

    public Post save (Post post) {
        postsDao.save(post);
        return post;
    }

    public Post findOnePost(long id){

        return postsDao.findOne(id);
    }

    public Iterable<Post> findAllPost(){

        return postsDao.findAll();
    }
}
