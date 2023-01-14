package com.example.service.impl;

import com.example.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServerImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running ...");
    }
}
