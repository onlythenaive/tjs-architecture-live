package ru.tsystems.javaschool.lectures.architecture.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @RequestMapping(method = RequestMethod.GET)
  public Object getAll() {
    return userRepository.findAll ();
  }
}
