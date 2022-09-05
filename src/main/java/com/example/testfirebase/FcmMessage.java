package com.example.testfirebase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class FcmMessage {
    private boolean validate_only;
    private Message message;

    @Builder
    @AllArgsConstructor
    @Data
    public static class Message {
        private String token;
        private Notification notification;
    }

    @Builder
    @AllArgsConstructor
    @Data
    public static class Notification {
        private String title;
        private String body;
    }

}
