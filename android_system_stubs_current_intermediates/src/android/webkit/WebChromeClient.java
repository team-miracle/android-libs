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
public class WebChromeClient
{
public static interface CustomViewCallback
{
public abstract  void onCustomViewHidden();
}
public abstract static class FileChooserParams
{
public  FileChooserParams() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri[] parseResult(int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
public abstract  int getMode();
public abstract  java.lang.String[] getAcceptTypes();
public abstract  boolean isCaptureEnabled();
public abstract  java.lang.CharSequence getTitle();
public abstract  java.lang.String getFilenameHint();
public abstract  android.content.Intent createIntent();
public static final int MODE_OPEN = 0;
public static final int MODE_OPEN_MULTIPLE = 1;
public static final int MODE_SAVE = 3;
}
public  WebChromeClient() { throw new RuntimeException("Stub!"); }
public  void onProgressChanged(android.webkit.WebView view, int newProgress) { throw new RuntimeException("Stub!"); }
public  void onReceivedTitle(android.webkit.WebView view, java.lang.String title) { throw new RuntimeException("Stub!"); }
public  void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  void onReceivedTouchIconUrl(android.webkit.WebView view, java.lang.String url, boolean precomposed) { throw new RuntimeException("Stub!"); }
public  void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onShowCustomView(android.view.View view, int requestedOrientation, android.webkit.WebChromeClient.CustomViewCallback callback) { throw new RuntimeException("Stub!"); }
public  void onHideCustomView() { throw new RuntimeException("Stub!"); }
public  boolean onCreateWindow(android.webkit.WebView view, boolean isDialog, boolean isUserGesture, android.os.Message resultMsg) { throw new RuntimeException("Stub!"); }
public  void onRequestFocus(android.webkit.WebView view) { throw new RuntimeException("Stub!"); }
public  void onCloseWindow(android.webkit.WebView window) { throw new RuntimeException("Stub!"); }
public  boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsConfirm(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsPrompt(android.webkit.WebView view, java.lang.String url, java.lang.String message, java.lang.String defaultValue, android.webkit.JsPromptResult result) { throw new RuntimeException("Stub!"); }
public  boolean onJsBeforeUnload(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onExceededDatabaseQuota(java.lang.String url, java.lang.String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onReachedMaxAppCacheSize(long requiredStorage, long quota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
public  void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) { throw new RuntimeException("Stub!"); }
public  void onGeolocationPermissionsHidePrompt() { throw new RuntimeException("Stub!"); }
public  void onPermissionRequest(android.webkit.PermissionRequest request) { throw new RuntimeException("Stub!"); }
public  void onPermissionRequestCanceled(android.webkit.PermissionRequest request) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean onJsTimeout() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onConsoleMessage(java.lang.String message, int lineNumber, java.lang.String sourceID) { throw new RuntimeException("Stub!"); }
public  boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getDefaultVideoPoster() { throw new RuntimeException("Stub!"); }
public  android.view.View getVideoLoadingProgressView() { throw new RuntimeException("Stub!"); }
public  void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> callback) { throw new RuntimeException("Stub!"); }
public  boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> filePathCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void openFileChooser(android.webkit.ValueCallback<android.net.Uri> uploadFile, java.lang.String acceptType, java.lang.String capture) { throw new RuntimeException("Stub!"); }
}
