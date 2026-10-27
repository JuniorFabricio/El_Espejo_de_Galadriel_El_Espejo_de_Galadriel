package com.example.el_espejo_de_galadriel_el_espejo_de_galadriel

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class EspejoActivity : AppCompatActivity()
{
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espejo)

        webView=findViewById(R.id.webViewEspejo)


        webView.webViewClient= WebViewClient()
        webView.webChromeClient= WebChromeClient()

        //Te lo dejo asi pero para que quede mejor se puede usar una lambda
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true





        //Aparte de tirar el enlace directo , puedes crear tu html y pasarlo aqui y que se vea bonito
        //Pero lo deje asi por que daba una cosa fea y no me gustaba , funcionaba pero bueno.
        webView.loadUrl("https://www.youtube.com/watch?v=R4qfx3ZMSB8")


    }
    //Esto para cerrar bien el webView
    override fun onDestroy() {
        webView.stopLoading()
        webView.destroy()
        super.onDestroy()
    }

}