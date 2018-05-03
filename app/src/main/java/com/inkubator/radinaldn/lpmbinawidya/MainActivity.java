package com.inkubator.radinaldn.lpmbinawidya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wvutama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvutama = (WebView) findViewById(R.id.wvutama);
        WebSettings settings = wvutama.getSettings();
        settings.setJavaScriptEnabled(true);
        wvutama.setWebViewClient(new WebViewClient());
        settings.setPluginState(WebSettings.PluginState.ON);

        wvutama.loadUrl("http://www.lpm-binawidya.com");
    }
}
