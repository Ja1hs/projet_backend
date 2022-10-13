package com.example.demo.email;

public interface EmailSender {
    void send(String to, String email, boolean encoding);

    void send(String email, String buildEmail);
}
