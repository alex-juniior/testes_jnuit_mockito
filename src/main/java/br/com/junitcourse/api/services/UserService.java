package br.com.junitcourse.api.services;

import br.com.junitcourse.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();

}
