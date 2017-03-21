package ru.tsystems.javaschool.lectures.architecture.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

  @Id
  @GeneratedValue
  @Column
  private Long id;

  @Column
  private String fullname;

  public String getFullname () {
    return fullname;
  }

  public void setFullname (final String fullname) {
    this.fullname = fullname;
  }

  public Long getId () {
    return id;
  }

  public void setId (final Long id) {
    this.id = id;
  }
}
