package com.guestbook.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import spark.ResponseTransformer;

public class GuestBookTransformer implements ResponseTransformer {

    private Gson gson = new GsonBuilder().serializeNulls().create();

    @Override
    public String render(Object model) throws Exception {
        return gson.toJson(model);
    }
}
