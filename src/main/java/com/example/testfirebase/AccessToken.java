package com.example.testfirebase;


import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.auth.oauth2.GoogleCredentials;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class AccessToken {

    public String getAccessToken(String keyFile, List<String> scopes) throws IOException {

        GoogleCredentials googleCredential = GoogleCredentials
                .fromStream(new ClassPathResource(keyFile).getInputStream())
                .createScoped(scopes);
        googleCredential.refreshIfExpired();
        return googleCredential.getAccessToken().getTokenValue();
    }
}