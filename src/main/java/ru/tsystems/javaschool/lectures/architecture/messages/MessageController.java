package ru.tsystems.javaschool.lectures.architecture.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages")
public class MessageController {

  @Autowired
  private MessageRepository messageRepository;

  @RequestMapping(method = RequestMethod.GET)
  public Object getAll(@RequestParam(name = "user", defaultValue = "") String user) {
    return messageRepository.findAllByUser (user);
  }
}
