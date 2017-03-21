package ru.tsystems.javaschool.lectures.architecture.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User getByFullname(String fullname);
}
