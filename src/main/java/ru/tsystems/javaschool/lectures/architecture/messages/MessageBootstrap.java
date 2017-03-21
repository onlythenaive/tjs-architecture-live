package ru.tsystems.javaschool.lectures.architecture.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.tsystems.javaschool.lectures.architecture.users.User;
import ru.tsystems.javaschool.lectures.architecture.users.UserBootstrap;
import ru.tsystems.javaschool.lectures.architecture.users.UserRepository;

import javax.annotation.PostConstruct;

@Component
@Lazy(false)
public class MessageBootstrap {

  @Autowired
  private UserBootstrap userBootstrap;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private MessageRepository messageRepository;

  @PostConstruct
  public void init() {
    User adam = userRepository.getByFullname ("Eva");
    Message message1 = new Message ();
    message1.setContent ("Hi There!");
    message1.setUser (adam);
    messageRepository.save (message1);
  }
}
