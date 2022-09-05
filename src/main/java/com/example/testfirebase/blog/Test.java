package com.example.testfirebase.blog;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test {

    public void test() throws FirebaseMessagingException, IOException {
        FileInputStream refreshToken = new FileInputStream("/Users/beeb/Downloads/github_opensource/testFirebase/src/main/resources/firebase/fcmtest-ffe46-firebase-adminsdk-7beow-4a569bf917.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(refreshToken))
                .build();
        FirebaseApp.initializeApp(options);

        String token = "f0f5EUQRT9WMqM0uYUluUV:APA91bEHc4Zo5VygQyabvG8d-WLlHioZmyQo81bPlUik0U11uR91q0wzgojpShm_BpHdzg7O1OCovDBYS-cK8LNwujM8vLs7Qn9E8C6AcRERO-OWcMGQmkN7PBoZvOO7CtuTQkXewmho";
        List<String> registrationTokens = Arrays.asList(
                token,
                token
        );

        MulticastMessage message = MulticastMessage.builder()
                .putData("score", "850")
                .putData("time", "2:45")
                .setAndroidConfig(AndroidConfig.Builder)
                .addAllTokens(registrationTokens)
                .build();

        BatchResponse response = FirebaseMessaging.getInstance().sendMulticast(message);
        System.out.println("response = " + response);

        System.out.println(response.getSuccessCount() + " messages were sent successfully");
//        Object FirebaseMessagingSnippets;

    }

}