package code81.libraryManagement.repository;

import code81.libraryManagement.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SystemUser , Long> {
}
