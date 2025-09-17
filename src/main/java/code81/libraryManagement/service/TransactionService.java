package code81.libraryManagement.service;

import code81.libraryManagement.entity.Book;
import code81.libraryManagement.entity.BorrowTransaction;
import code81.libraryManagement.entity.Member;
import code81.libraryManagement.repository.BookRepository;
import code81.libraryManagement.repository.MemberRepository;
import code81.libraryManagement.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepo;
    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;
    public List<BorrowTransaction> getAllTransactions()
    {
        return transactionRepo.findAll();
    }
    public BorrowTransaction borrowBook(Long bookId, Long memberId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        BorrowTransaction transaction = new BorrowTransaction();
        transaction.setBook(book);
        transaction.setMember(member);
        transaction.setBorrowDate(LocalDate.now().toString());
        transaction.setDueDate(LocalDate.now().plusWeeks(2).toString()); // 2 weeks borrow period
        transaction.setStatus("BORROWED");

        return transactionRepo.save(transaction);
    }

    public BorrowTransaction returnBook(Long transactionId) {
        BorrowTransaction transaction = transactionRepo.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        transaction.setReturnDate(LocalDate.now().toString());
        transaction.setStatus("RETURNED");

        return transactionRepo.save(transaction);
    }


}
