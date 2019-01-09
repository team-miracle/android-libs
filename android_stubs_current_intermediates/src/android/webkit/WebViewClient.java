/*
* Copyright (C) 2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.webkit;
public class WebViewClient
{
public  WebViewClient() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) { throw new RuntimeException("Stub!"); }
public  void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) { throw new RuntimeException("Stub!"); }
public  void onPageFinished(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onLoadResource(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void onPageCommitVisible(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onTooManyRedirects(android.webkit.WebView view, android.os.Message cancelMsg, android.os.Message continueMsg) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) { throw new RuntimeException("Stub!"); }
public  void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) { throw new RuntimeException("Stub!"); }
public  void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) { throw new RuntimeException("Stub!"); }
public  void onFormResubmission(android.webkit.WebView view, android.os.Message dontResend, android.os.Message resend) { throw new RuntimeException("Stub!"); }
public  void doUpdateVisitedHistory(android.webkit.WebView view, java.lang.String url, boolean isReload) { throw new RuntimeException("Stub!"); }
public  void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) { throw new RuntimeException("Stub!"); }
public  void onReceivedClientCertRequest(android.webkit.WebView view, android.webkit.ClientCertRequest request) { throw new RuntimeException("Stub!"); }
public  void onReceivedHttpAuthRequest(android.webkit.WebView view, android.webkit.HttpAuthHandler handler, java.lang.String host, java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  boolean shouldOverrideKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onUnhandledKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onScaleChanged(android.webkit.WebView view, float oldScale, float newScale) { throw new RuntimeException("Stub!"); }
public  void onReceivedLoginRequest(android.webkit.WebView view, java.lang.String realm, java.lang.String account, java.lang.String args) { throw new RuntimeException("Stub!"); }
public  boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) { throw new RuntimeException("Stub!"); }
public  void onSafeBrowsingHit(android.webkit.WebView view, android.webkit.WebResourceRequest request, int threatType, android.webkit.SafeBrowsingResponse callback) { throw new RuntimeException("Stub!"); }
public static final int ERROR_AUTHENTICATION = -4;
public static final int ERROR_BAD_URL = -12;
public static final int ERROR_CONNECT = -6;
public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
public static final int ERROR_FILE = -13;
public static final int ERROR_FILE_NOT_FOUND = -14;
public static final int ERROR_HOST_LOOKUP = -2;
public static final int ERROR_IO = -7;
public static final int ERROR_PROXY_AUTHENTICATION = -5;
public static final int ERROR_REDIRECT_LOOP = -9;
public static final int ERROR_TIMEOUT = -8;
public static final int ERROR_TOO_MANY_REQUESTS = -15;
public static final int ERROR_UNKNOWN = -1;
public static final int ERROR_UNSAFE_RESOURCE = -16;
public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
public static final int ERROR_UNSUPPORTED_SCHEME = -10;
public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;
}
