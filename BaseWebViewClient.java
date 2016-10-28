package global.wemakeprice.com.basemodule;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ByunghooLim on 2016. 10. 28..
 * Custom WebView Client
 */

public abstract class BaseWebViewClient extends WebViewClient {
    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return customShouldOverrideUrlLoading(view, url);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return customShouldOverrideUrlLoading(view, request.getUrl().toString());
    }

    protected abstract boolean customShouldOverrideUrlLoading(WebView view, String url);
}
