package com.example.getyalocation;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class Client {
    private static OkHttpClient client;

    private Client(){}

    public static OkHttpClient getInstance() {
        if (client == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();
        }
        return client;
    }
}
