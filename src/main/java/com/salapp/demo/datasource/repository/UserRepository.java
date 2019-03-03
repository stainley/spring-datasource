package com.salapp.demo.datasource.repository;

import com.salapp.demo.datasource.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Stainley Lebron
 * @since 2019-03-02.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
