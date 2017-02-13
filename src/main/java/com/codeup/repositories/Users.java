package com.codeup.repositories;

import com.codeup.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by PapoteDetres1 on 2/13/17.
 */

@Repository
public interface Users extends CrudRepository<User,Integer> {
    public User findByUsername(String username);


}
