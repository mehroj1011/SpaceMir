package com.mirrox.spacemir.game

import android.graphics.Bitmap
import android.net.Uri
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun GameWebViewScreen(url: String) {
    val decodedUrl = Uri.decode(url)  // Декодируем URL для использования в WebView

    var backEnable by remember {
        mutableStateOf(false)
    }
    var webView: WebView? = null
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = object : WebViewClient() {
                    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                        backEnable = view!!.canGoBack()
                    }
                }
                settings.javaScriptEnabled = true
                loadUrl(decodedUrl)
                webView = this
            }
        }, update = { webView = it }
    )
    BackHandler(enabled = backEnable) {
        webView?.goBack()
    }
}