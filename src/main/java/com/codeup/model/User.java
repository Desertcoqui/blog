package com.codeup.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by PapoteDetres1 on 2/13/17.
 */

@Entity
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String username;

    @OneToMany(cascade = CascadeType.ALL, mappedBy= "user")
    private List<Post> posts;

    public User(User user){
        id= user.id;
        username= user.username;
        password=user.password;
        email=user.email;
        posts=user.posts;
    }

    public User (){

    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
