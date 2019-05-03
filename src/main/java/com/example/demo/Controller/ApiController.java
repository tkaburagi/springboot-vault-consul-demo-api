package com.example.demo.Controller;

import com.example.demo.Repository.BookJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final BookJpaRepository bookJpaRepository;
    private static Logger log = LoggerFactory.getLogger(ApiController.class);

    public ApiController(BookJpaRepository bookJpaRepository) {
        this.bookJpaRepository = bookJpaRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/allbooks")
    public Object getAllBook() throws Exception {
        log.info("Handling allbooks");
        return bookJpaRepository.findAll();
    }
}
