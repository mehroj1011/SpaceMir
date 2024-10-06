package com.mirrox.spacemir.screens

import android.graphics.Bitmap
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController

@Composable
fun SolarSystemScreen(navController: NavController) {
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
                loadUrl("https://eyes.nasa.gov/apps/solar-system/#/home")
                webView = this
            }
        }, update = { webView = it }
    )
    BackHandler(enabled = backEnable) {
        webView?.goBack()
    }
}
