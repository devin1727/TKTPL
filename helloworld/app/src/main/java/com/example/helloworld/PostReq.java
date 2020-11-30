package com.example.helloworld;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

class PostReq extends AsyncTask<String, Void, String> {

    private Exception exception;
    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");
    OkHttpClient client =  new OkHttpClient();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    protected String doInBackground(String... json) {
        RequestBody body = RequestBody.create(json[0], JSON);
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url("https://1163867b2c58a14453aea9367bf554de.m.pipedream.net")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            Log.i("Response", "Berha" +
                    "sil");
            return response.body().string();
        } catch (IOException e) {
            Log.i("Response", "Error");
            e.printStackTrace();
            return "Error";
        }
    }
}
