# BaseWebViewClient
Customized WebViewClient for Android API 24

Since Api24, public boolean shouldOverrideUrlLoading(WebView view, String url)

replaced to public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request).

However, public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) requires at least Api 21.

If your app have to cover below API 21, It may be useful for you.
