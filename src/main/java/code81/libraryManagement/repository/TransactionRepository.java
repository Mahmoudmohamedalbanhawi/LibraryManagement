package code81.libraryManagement.repository;

import code81.libraryManagement.entity.BorrowTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<BorrowTransaction , Long> {
}
