package com.example.webviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var imageGoogle : ImageView
    private lateinit var imageFacebook : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        imageGoogle = findViewById(R.id.ivGoogle)
        imageFacebook = findViewById(R.id.ivFacebook)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.google.com/")

        imageGoogle.setOnClickListener {
            webView.loadUrl("https://www.google.com/")
        }

        imageFacebook.setOnClickListener {
            webView.loadUrl("https://www.facebook.com/")
        }

        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)

    }
}