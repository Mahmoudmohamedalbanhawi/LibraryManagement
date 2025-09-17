package code81.libraryManagement.repository;

import code81.libraryManagement.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SystemUser , Long> {

    Optional<SystemUser> findByUserName(String userName);
}
