package code81.libraryManagement.controller;

import code81.libraryManagement.entity.BorrowTransaction;
import code81.libraryManagement.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @GetMapping
    public List<BorrowTransaction> getAllTransaction()
    {
        return transactionService.getAllTransactions();
    }

    @PostMapping("/borrow/{bookId}/{memberId}")
    public BorrowTransaction borrowBook(@PathVariable Long bookId ,@PathVariable Long memberId)

    {

        return transactionService.borrowBook(bookId , memberId);
    }
    @PostMapping("/return/{id}")
    public BorrowTransaction returnBook(@PathVariable Long transactionId)
    {
        return transactionService.returnBook(transactionId);
    }

}
