package ru.tsystems.javaschool.lectures.architecture.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy(false)
public class UserBootstrap {

  @Autowired
  private UserRepository userRepository;

  @PostConstruct
  public void init() {
    User adam = new User ();
    adam.setFullname ("Adam");
    userRepository.save (adam);
    User eva = new User ();
    eva.setFullname ("Eva");
    userRepository.save (eva);
  }
}
