//package com.example.testfirebase;
//
//
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.messaging.FirebaseMessaging;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class Push {
//    private final String FCM_PRIVATE_KEY_PATH = "firebase/fcmtest-ffe46-firebase-adminsdk-7beow-4a569bf917.json";
//    private final List<String> SCOPES = new ArrayList<>();
//    private final StringBuffer responseBody;
//    private final AccessToken accessToken;
//
//
//    private static final String ENDPOINT = "https://fcm.googleapis.com/v1/projects/fcmtest-ffe46/messages:send";
//
//
//    public String send(String userToken, String message) throws IOException {
//
//        FirebaseApp app = new FirebaseApp();
//        FirebaseMessaging messaging = app.getInstance();
//        messaging.sendMulticast()
//
//
//
//        SCOPES.add("https://www.googleapis.com/auth/firebase.messaging");
//
//        HttpURLConnection http;
//        URL url = new URL(ENDPOINT);
//        http = (HttpURLConnection) url.openConnection();
//
//        http.setRequestMethod("POST");
//        http.setDoInput(true);
//        http.setRequestProperty("Authorization", "Bearer " + accessToken.getAccessToken(FCM_PRIVATE_KEY_PATH, SCOPES));
//        http.setRequestProperty("Content-Type", "application/json; UTF-8");
//
//        http.setDoOutput(true);
//        OutputStream os = http.getOutputStream();
//
//
//        String body =
//                "{\n" + "\"message\":{\n" + " \"notification\": {\n" + " \"title\": \"FCM Message\",\n"
//                        + " \"body\": \"" + message + "\",\n"
//                        + "  },\n" + " \"token\": \"" + userToken + "\"\n" + "  }\n" + "}\n";
//
//        System.out.println(body);
//
//        os.write(body.getBytes());
//        os.flush();
//        os.close();
//
//        System.out.println("* CODE : " + http.getResponseCode());
//        System.out.println("* MSG  : " + http.getResponseMessage());
//
//        if (http.getResponseCode() == 200) {
//            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(), "UTF8"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                responseBody.append(line);
//            }
//
//            br.close();
//        }
//
//        http.disconnect();
//
//        return http.getResponseMessage();
//    }
//
//
//
//}
