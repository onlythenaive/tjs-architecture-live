package ru.tsystems.javaschool.lectures.architecture.messages;

import ru.tsystems.javaschool.lectures.architecture.users.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Collection;

@Entity
@Table
public class Message {

  @Id
  @GeneratedValue
  @Column
  private Long id;

  @Column
  private String content;

  @Column
  private Instant createdAt;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public User getUser () {
    return user;
  }

  public void setUser (final User user) {
    this.user = user;
  }

  public Long getId () {
    return id;
  }

  public void setId (final Long id) {
    this.id = id;
  }

  public String getContent () {
    return content;
  }

  public void setContent (final String content) {
    this.content = content;
  }

  public Instant getCreatedAt () {
    return createdAt;
  }

  public void setCreatedAt (final Instant createdAt) {
    this.createdAt = createdAt;
  }

  @PrePersist
  public void prePersist() {
    createdAt = Instant.now ();
  }
}
