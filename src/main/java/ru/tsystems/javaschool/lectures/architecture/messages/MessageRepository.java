package ru.tsystems.javaschool.lectures.architecture.messages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MessageRepository extends JpaRepository<Message, Long> {

  @Query("SELECT m FROM Message as m WHERE m.user.fullname LIKE :name")
  Collection<Message> findAllByUser (@Param ("name") String name);
}
