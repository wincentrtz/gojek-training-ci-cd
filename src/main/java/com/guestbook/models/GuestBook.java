package com.guestbook.models;

import java.util.Date;

public class GuestBook {

    private Integer id;
    private Date datetime;
    private String name;
    private String comment;

    public GuestBook(Integer id, Date datetime, String name, String comment) {
        this.id = id;
        this.datetime = datetime;
        this.name = name;
        this.comment = comment;
    }

}
