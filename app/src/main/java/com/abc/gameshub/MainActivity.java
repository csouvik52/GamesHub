package com.abc.gameshub;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    WebView web;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im=(ImageView)findViewById(R.id.imageView2);
        web=(WebView)findViewById(R.id.web);
        web.loadUrl("file:///android_res/raw/web.html");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in =new Intent(MainActivity.this,Arena.class);
                startActivity(in);
                finish();
            }
        }, 5500);
    }

    @Override
    public void onBackPressed() {

    }
}
