package com.codegym.book_rental_app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectException {

    private int visitedNumber =0;
    @Pointcut("execution(* com.codegym.book_rental_app.service.IBookService.*(..))")
    public void afterPayBookController(){
    }

    @AfterThrowing("afterPayBookController()")
    public void throwAfterPayBookController(){
        System.out.println("Borrowed is false!");
    }
    @Pointcut("execution(* com.codegym.book_rental_app.service.IBookService.*(..))")
    public void afterBorrowBookController(){
    }

    @AfterThrowing("afterBorrowBookController()")
    public void throwAfterBorrowBookController(){
        System.out.println("The book is out");
    }

    @Pointcut("execution(* com.codegym.book_rental_app.service.IBookService.*(..))")
    public void afterVisitedController(){
    }

    @After("afterVisitedController()")
    public void throwAfterVisitedController(){
        visitedNumber++;
        System.out.println("Current visit count is "+ visitedNumber);
    }
}
