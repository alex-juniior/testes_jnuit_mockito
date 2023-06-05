package br.com.junitcourse.api.config;

import br.com.junitcourse.api.domain.User;
import br.com.junitcourse.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.beans.BeanProperty;
import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){
        User u1 = new User(null, "Jony", "jony@email.com", "1234");
        User u2 = new User(null, "Grow", "grow@email.com", "1234");

        repository.saveAll(List.of(u1, u2));

    }
}
