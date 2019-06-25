package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView wvGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        wvGoogle = findViewById(R.id.wvGoogle);
        wvGoogle.getSettings().setJavaScriptEnabled(true);
        wvGoogle.loadUrl("http://www.google.com");
    }
}
