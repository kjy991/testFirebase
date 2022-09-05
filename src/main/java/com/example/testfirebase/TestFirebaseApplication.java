package com.example.testfirebase;
import com.example.testfirebase.blog.Test;
import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TestFirebaseApplication {


    public static void main(String[] args) throws Exception {
        test1();
    }

    public static void test1() throws FirebaseMessagingException, IOException {
        Test test = new Test();
        test.test();
    }

}




