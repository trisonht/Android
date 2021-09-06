package com.example.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class ArticleActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        setTitle("Article Content");

        webView = findViewById(R.id.webView);


        Bundle extras = getIntent().getExtras();
        String content = extras.getString("content");
        boolean onlineMode = extras.getBoolean("onlineMode");

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        //webView.loadUrl("https://mbasic.facebook.com");

        if (onlineMode) {
            webView.loadUrl(content);
        } else {
            //webView.loadData(staticContent, "text/html", "UTF-8");
            webView.loadDataWithBaseURL(null, content, "text/html", "utf-8", null);
        }

    }
}