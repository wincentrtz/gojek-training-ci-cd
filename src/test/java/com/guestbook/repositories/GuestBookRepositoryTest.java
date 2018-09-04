package com.guestbook.repositories;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestBookRepositoryTest {

    @Test
    public void shouldIncreaseSizeAndId() {
        GuestBookRepository guestBookRepository = new GuestBookRepository();
        Integer savedId = guestBookRepository.save("faizal", "comment");

        assertEquals((Integer) 1, savedId);
        assertEquals(1, guestBookRepository.guestBookList.size());
    }
}