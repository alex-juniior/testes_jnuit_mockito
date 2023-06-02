package br.com.junitcourse.api.services;

import br.com.junitcourse.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
