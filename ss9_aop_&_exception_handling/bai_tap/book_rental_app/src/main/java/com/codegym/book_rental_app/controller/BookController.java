package com.codegym.book_rental_app.controller;

import com.codegym.book_rental_app.model.Book;
import com.codegym.book_rental_app.model.BorrowedBook;
import com.codegym.book_rental_app.model.User;
import com.codegym.book_rental_app.service.IBookService;
import com.codegym.book_rental_app.service.IBorrowedBookService;
import com.codegym.book_rental_app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IBorrowedBookService borrowedBookService;

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    private String goList(Model model,
                          @PageableDefault(value = 3) Pageable pageable) {

        model.addAttribute("book", this.bookService.findAll(pageable));

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {

        model.addAttribute("book", new Book());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Book book) {
        book.setCurrentQuantity(book.getQuantity());
        bookService.save(book);

        return "redirect:/list";
    }

    @GetMapping("/borrowed")
    public String showFormBorrow(@RequestParam Integer id, Model model) {
        Book book = bookService.findById(id);
        if (book != null) {
            if (book.getCurrentQuantity() > 0) {
                model.addAttribute("book", book);
                return "borrowed";
            } else {
                throw new NumberFormatException("");
            }
        }
        return "redirect:/list";
    }

    @PostMapping("/borrowed")
    public String borrowBook(@ModelAttribute Book book, @RequestParam String userName) {
        book.setCurrentQuantity(book.getCurrentQuantity() - 1);
        User user = userService.findByName(userName);
        BorrowedBook borrowedBook = new BorrowedBook(randomBorrowedBook(), book, user);
        borrowedBookService.save(borrowedBook);
        bookService.save(book);
        return "redirect:/list";
    }

    @GetMapping("/pay")
    public String showFormPayBook(Model model){
        model.addAttribute("borrowed" , new BorrowedBook());
        return "pay";
    }

    @PostMapping("/pay")
    public String payBook(@RequestParam String borrowed){
        BorrowedBook borrowedBook = borrowedBookService.findByBorrowedBook(borrowed);
        Book book = bookService.findById(borrowedBook.getBook().getId());
        book.setCurrentQuantity(book.getCurrentQuantity() + 1);
        bookService.save(book);
        borrowedBookService.delete(borrowedBook);

        return "redirect:/list";

    }

    private String randomBorrowedBook() {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += randomNumber();
        }
        return result;
    }

    private int randomNumber() {
        int number = (int) Math.round(Math.random() * 9);
        return number;
    }
}
