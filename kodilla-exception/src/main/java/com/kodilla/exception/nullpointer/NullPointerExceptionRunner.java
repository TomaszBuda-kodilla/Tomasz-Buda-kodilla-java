package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send [" + e + "] ,but my program still running very well.");
        } finally {
            System.out.println("Don't forget about finally.");
        }
        System.out.println("Processing other logic!");
    }
}