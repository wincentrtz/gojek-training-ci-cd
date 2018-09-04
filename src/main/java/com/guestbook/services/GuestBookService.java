package com.guestbook.services;

import com.guestbook.models.CommentRequest;
import com.guestbook.repositories.GuestBookRepository;

public class GuestBookService {

    private GuestBookRepository repository;

    public GuestBookService(GuestBookRepository repository) {
        this.repository = repository;
    }

    public Integer save(CommentRequest commentRequest) {
        return repository.save(commentRequest.getName(), commentRequest.getComment());
    }
}
