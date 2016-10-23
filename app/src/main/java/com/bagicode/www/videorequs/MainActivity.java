package com.bagicode.www.videorequs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webview);
        String text = "Hi mbak, ini udah rata kiri kanan loh, " +
                "Hi mbak, ini udah rata kiri kanan loh," +
                "Hi mbak, ini udah rata kiri kanan loh," +
                "Hi mbak, ini udah rata kiri kanan loh," +
                "Hi mbak, ini udah rata kiri kanan loh," +
                "Hi mbak, ini udah rata kiri kanan loh," +
                "Hi mbak, ini udah rata kiri kanan loh";

        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
}
