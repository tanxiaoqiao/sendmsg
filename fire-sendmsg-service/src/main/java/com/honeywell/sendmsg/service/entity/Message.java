package com.honeywell.sendmsg.service.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
    private String title;
    private String content;
    private Android android;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Message() {
    }
}
