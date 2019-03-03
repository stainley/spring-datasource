package com.salapp.demo.datasource.model;

import com.salapp.demo.datasource.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Stainley Lebron
 * @since 2019-03-02.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenCalledSave_theCorrectNumberOfUsers() {
        userRepository.save(new User("Bod", "bod@gmail.com"));
        List<User> users = (List<User>) userRepository.findAll();
        Assert.assertEquals(users.size(), 3);
    }
}
